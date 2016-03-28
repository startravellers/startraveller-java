package startraveller.core.implementation;

import abstractimplementation.AbstractValidator;
import startraveller.core.implementation.validators.AbilityScoreValidator;

public class STValidator extends AbstractValidator {
	
	public STValidator() {
		//List of validators to pre-register
		register("AbilityScoreValidator", new AbilityScoreValidator());
	}
}
