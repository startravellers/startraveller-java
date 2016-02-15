package startraveler;

import rpg.character.PointBuy;
import rpg.character.PointBuyVerifier;

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
}
