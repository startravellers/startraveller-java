package startraveller.core.implementation.validators;

import core.PreCharacter;
import core.builder.IllegalChoiceException;
import startraveller.core.Validator;
import startraveller.core.implementation.choices.AbilityScoreChoice;

public class AbilityScoreValidator implements Validator {
	private final int POINTS = 15;
	@Override
	public boolean validateCharacter(PreCharacter precharacter) {
		AbilityScoreChoice abilityScoreChoice = (AbilityScoreChoice)precharacter.get("AbilityScore");
		int sum = 0;
		try {
			for (int score : abilityScoreChoice.getScores()) {
				sum += scorePrice(score);
			}
			return sum <= POINTS;
		} catch (IllegalChoiceException e) {
			return false;
		}
	}
	
	private int scorePrice(int score) throws IllegalChoiceException {
		if (score < 7 || score > 18) {
			throw new IllegalChoiceException();
		}
		if (score < 10) {
			return (int)-Math.pow(2, 9 - score);
		}
		int price = score - 10;
		if (score > 13) {
			price += score - 13;
		}
		if (score > 15) {
			price += score - 15;
		}
		if (score == 18) {
			price += 1;
		}
		return price;
	}
}
