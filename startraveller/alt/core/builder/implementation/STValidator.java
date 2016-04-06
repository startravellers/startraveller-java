package startraveller.alt.core.builder.implementation;

import startraveller.alt.core.builder.Validator;
import startraveller.alt.core.implementation.STChoiceValidator;
import startraveller.alt.core.implementation.STValidationStrategy;

public class STValidator extends Validator {

	public STValidator() {
		super(new STChoiceValidator(), new STValidationStrategy());
		// TODO Auto-generated constructor stub
	}

}
