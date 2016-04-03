package startraveller.alt.core.builder;

import startraveller.alt.core.Choice;
import startraveller.alt.core.ChoiceValidator;
import startraveller.alt.core.PreCharacter;
import startraveller.alt.core.Ruling;
import startraveller.alt.core.ValidationStrategy;

public class Validator {
	private ChoiceValidator _choiceValidator;
	private ValidationStrategy _validationStrategy;
	
	
	public Ruling validate(Choice choice) {
		return _choiceValidator.isLegal(choice);
	}
	public Ruling validate(PreCharacter preCharacter) {
		return preCharacter.validate(_validationStrategy);
	}
	
	public Validator(ChoiceValidator choiceValidator, ValidationStrategy validationStrategy) {
		_choiceValidator = choiceValidator;
		_validationStrategy = validationStrategy;
	}
}
