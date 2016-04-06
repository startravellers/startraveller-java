package startraveller.alt.core.builder.implementation;

import startraveller.alt.core.ChoiceFactory;
import startraveller.alt.core.PreCharacter;
import startraveller.alt.core.builder.Assembler;
import startraveller.alt.core.builder.Builder;
import startraveller.alt.core.builder.Validator;
import startraveller.alt.core.implementation.*;

public class STBuilder extends Builder {

	public STBuilder() {
		super(
				new STChoiceFactory(new STCharacteristicFactory()),
				new Validator(
						new STChoiceValidator(),
						new STValidationStrategy()
						),
				new STAssembler()
			);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PreCharacter initializePreCharacter() {
		return new STPreCharacter();
	}

}
