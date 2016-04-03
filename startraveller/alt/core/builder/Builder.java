package startraveller.alt.core.builder;

import startraveller.alt.core.DisplayCharacter;
import startraveller.alt.core.PreCharacter;
import startraveller.alt.core.Ruling;
import startraveller.alt.core.builder.Validator;
import startraveller.alt.core.Choice;
import startraveller.alt.core.ChoiceFactory;
import startraveller.alt.core.builder.RPGCharacterException;

public abstract class Builder {
	private ChoiceFactory _choiceFactory;
	private Validator _validator;
	private Assembler _assembler;
	private PreCharacter _precharacter;
	public Builder(ChoiceFactory choiceFactory, Validator validator, Assembler assembler) {
		_choiceFactory = choiceFactory;
		_validator = validator;
		_assembler = assembler;
		_precharacter = initializePreCharacter();
	}	
	public Builder add(String name, String... values) throws RPGCharacterException {
		addToPreCharacterOrThrow(_choiceFactory.make(name, values));
		return this;
	}
	public Builder add(String name, int... values) throws RPGCharacterException{
		addToPreCharacterOrThrow(_choiceFactory.make(name, values));
		return this;
	}
	private void addToPreCharacterOrThrow(Choice choice) throws RPGCharacterException {
		Ruling ruling = _validator.validate(choice);
		if (ruling.isInFavour()) {
			choice.offerTo(_precharacter);
		} else {
			throw new RPGCharacterException(ruling.message());
		}
	}
	public DisplayCharacter build() throws RPGCharacterException {
		Ruling ruling = _validator.validate(_precharacter);
		if (ruling.isInFavour()) {
			return _assembler.assemble(_precharacter);
		}
		throw new RPGCharacterException(ruling.message());
	}
	protected abstract PreCharacter initializePreCharacter();
}
