package startraveler;

import rpg.character.PointBuy;

public class AbilityPurchase extends PointBuy {
	
	private static final String TAG = "base_ability_point_buy";
	
	public static final String STRENGTH = "STRENGTH";
	public static final String DEXTERITY = "DEXTERITY";
	public static final String CONSTITUTION = "CONSTITUTION";
	public static final String INTELLIGENCE = "INTELLIGENCE";
	public static final String WISDOM = "WISDOM";
	public static final String CHARISMA = "CHARISMA";
	
	public static final String[] ABILITIES = new String[] {
			STRENGTH,
			DEXTERITY,
			CONSTITUTION,
			INTELLIGENCE,
			WISDOM,
			CHARISMA
	};
	
	public AbilityPurchase(
			int strength,
			int dexterity,
			int constitution,
			int intelligence,
			int wisdom,
			int charisma
			) {
		super(
				TAG,
				new int[] {
						strength, 
						dexterity, 
						constitution, 
						intelligence, 
						wisdom, 
						charisma
						}, 
				ABILITIES
			);
	}
	private AbilityPurchase(int[] scores) {
		super(TAG, scores, ABILITIES);
	}
	@Override
	public AbilityPurchase clone() {
		return new AbilityPurchase(getScores());
	}
}
