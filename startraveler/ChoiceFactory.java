package startraveler;

import rpg.character.*;

public class ChoiceFactory {
	public PointBuy getAbilityPurchase(
			int strength,
			int constitution,
			int dexterity,
			int intelligence,
			int wisdom,
			int charisma
			) {
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
	public SingleChoice getSpeciesChoice(int index) {
		return new SingleChoice(
					ChoiceContracts.SpeciesChoice.TAG,
					index,
					ChoiceContracts.SpeciesChoice.OPTIONS
				);
				
	}
	public Declaration getName(String name) {
		return new Declaration("NAME", name);
	}
	public MultipleChoice chooseClasses(int[] choices) {
		return new MultipleChoice(
					ChoiceContracts.Classes.TAG,
					choices
				);
				
	}
}
