package startraveler;

import rpg.character.PointBuyVerifier;

public class AbilityPointBuyVerifier extends PointBuyVerifier<AbilityPurchase> {
	private static final int MIN_VALUE = 7;
	private static final int MAX_VALUE = 18;
	private static final int[] POINT_BUY_CHART = new int[] {
			-4,
			-2,
			-1,
			0,
			1,
			2,
			3,
			4,
			5,
			7,
			10,
			13,
			17
	};
	private static final AbilityPurchase DEFAULT = new AbilityPurchase(10,10,10,10,10,10);
	private static final int WALLET = 15;
	public AbilityPointBuyVerifier() {
		super(WALLET, MIN_VALUE, MAX_VALUE, POINT_BUY_CHART, DEFAULT.clone(), "base_ability_score_point_buy");
		// TODO Auto-generated constructor stub
	}
}
