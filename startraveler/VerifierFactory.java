package startraveler;

import rpg.character.PointBuy;
import rpg.character.PointBuyVerifier;
import rpg.character.SingleChoiceNoRestrictionsVerifier;

public class VerifierFactory {
	public PointBuyVerifier getAbilityPointBuyVerifier() {
		return new PointBuyVerifier(
				15,
				7,
				18,
				ChoiceContracts.AbilityPurchase.POINT_BUY_CHART,
				new PointBuy(
						ChoiceContracts.AbilityPurchase.TAG,
						ChoiceContracts.AbilityPurchase.DEFAULT_VALUES,
						ChoiceContracts.AbilityPurchase.ABILITIES
						),
				ChoiceContracts.AbilityPurchase.TAG
				);
	}
	public SingleChoiceNoRestrictionsVerifier getSpeciesVerifier() {
		return new SingleChoiceNoRestrictionsVerifier(
					ChoiceContracts.SpeciesChoice.TAG,
					ChoiceContracts.SpeciesChoice.OPTIONS.length,
					null
				);
	}
}
