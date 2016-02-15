package rpg.character;

import startraveler.RuleViolationsLog;

public class PointBuyVerifier extends Verifier<PointBuy> {
	private static final String ERROR_MESSAGE = "%s score too %s. Was %d should be %d";

	private int _points;
	private int _minValue;
	private int _maxValue;
	private int[] _costs;
	private PointBuy _default;
	private String _name;
	
	public PointBuyVerifier(int points, int min, int max, int[] costs, PointBuy defaultPurchase, String verifierName) {
		_points = points;
		_minValue = min;
		_maxValue = max;
		_costs = costs.clone();
		_default = defaultPurchase;
		_name = verifierName;
	}
	@Override
	public boolean verify(PointBuy purchase) {
		int[] abilityScores = purchase.getScores();
		int sum = 0;
		int score;
		for (int i = 0; i < abilityScores.length; i++) {
			score = abilityScores[i];
			if (score < _minValue || score > _maxValue) {
				String cause;
				int limit;
				if (score < _minValue) {
					cause = "low";
					limit = new Integer(_minValue);
				} else {
					cause = "high";
					limit = new Integer(_maxValue);
				}
				RuleViolationsLog.getInstance().record(this, String.format(ERROR_MESSAGE, purchase.getCategories()[i], cause, score, limit));
				return false;
			} else {
			sum += _costs[score - _minValue]; 
			}
		}
		if (sum > _points) {
			RuleViolationsLog.getInstance().record(this, "Too many points spent. Spent " + sum + ". Limit was " + _points);
			return false;
		}
		return true;
	}

	@Override
	public PointBuy getDefaultPurchase() {
		return _default;
	}

	@Override
	public String toString() {
		return _name;
	}
	
}
