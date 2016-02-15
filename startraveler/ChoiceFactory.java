package startraveler;

import rpg.character.PointBuy;

public class ChoiceFactory {
	public PointBuy getAbilityPurchase(int strength, int constitution, int dexterity, int intelligence, int wisdom, int charisma) {
		return new PointBuy(
				ChoiceContracts.AbilityPurchase.TAG,
				new int[] {
						strength,
						dexterity,
						constitution,
						intelligence,
						wisdom,
						charisma
				},
				ChoiceContracts.AbilityPurchase.ABILITIES
				);
	}
}
