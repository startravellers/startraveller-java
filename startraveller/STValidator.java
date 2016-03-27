package startraveller;

import core.PreCharacter;
import core.DisplayCharacter;

public class STValidator {
	private STSubValidator _subValidator;
	public DisplayCharacter validateOrNull(PreCharacter character) {
		return null;
	}
	
	public STValidator(STSubValidator subValidator) {
		_subValidator = subValidator;
	}
}
