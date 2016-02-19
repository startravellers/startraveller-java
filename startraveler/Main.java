package startraveler;

import javax.xml.bind.util.ValidationEventCollector;

import rpg.character.PointBuy;
import rpg.character.PointBuyVerifier;
import rpg.character.Verifier;
import startraveler.tests.ConsoleWriter;

/*
 * Substitute Controller class.
 */

public class Main {
	public static void main(String[] args) {
		ChoiceFactory choiceFactory = new ChoiceFactory();
		VerifierFactory validatorFactory = new VerifierFactory();
		RulesManager rulesManager = new RulesManager(new ConsoleWriter());
		
		PointBuy abilityScores = choiceFactory.getAbilityPurchase(12, 12, 12, 12, 12, 12);
		if (validatorFactory.getAbilityPointBuyVerifier().verify(abilityScores)) {
			rulesManager.getAbilityPointBuyRules().applyRule(abilityScores);
		}
	}
}
