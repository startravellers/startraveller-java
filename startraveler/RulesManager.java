package startraveler;

import rpg.character.*;

public class RulesManager {

	private Writer _writer;
	public RulesManager(Writer writer) {
		_writer = writer;
	}
	public Rule<PointBuy> getAbilityPointBuyRules() {
		return new Rule<PointBuy>(_writer) {
			@Override
			public void applyRule(PointBuy choice) {
				for (int i = 0; i < choice.getScores().length; i++)
				_writer.add(choice.getTag(), choice.getCategories()[i], choice.getScores()[i]);
			}
			//_writer.notifyListeners();
		};
	}
}