package core.builder;

import core.*;
import core.DisplayCharacter;

public abstract class Builder {
	private ChoiceFactory _choiceFactory;
	private Validator _validator;
	private Assembler _assembler;
	private GameSystem _gameSystem;
	private PreCharacter _precharacter;
	public Builder(GameSystem gameSystem, ChoiceFactory choiceFactory, Validator validator, Assembler assembler) {
		_choiceFactory = choiceFactory;
		_validator = validator;
		_assembler = assembler;
		_gameSystem = gameSystem;
		_precharacter = initializePreCharacter();
	}
	protected abstract PreCharacter initializePreCharacter();
	
	
	/**
	 * Takes a choice name and associated arguments from the user, changes these
	 * into a valid choice object via the factory, then adds these to the
	 * precharacter object.
	 * TODO: Perhaps validation should occur here?
	 * @param name The name of the choice
	 * @param choice The collection of arguments comprising the choice with the
	 * provided name.
	 * @return the builder so that calls can be strung together.
	 */
	protected Builder add(String name, String... choice) {
		_precharacter.accept(_choiceFactory.create(name, choice));
		return this;
	}
	protected Builder add(String name, int... choice){
		_precharacter.accept(_choiceFactory.create(name, choice));
		return this;
	}
	public DisplayCharacter build() {
		if (_validator.validateCharacter(_precharacter, _gameSystem)) {
			return _assembler.assemble(_precharacter, _gameSystem);
		}
		throw new IllegalPreCharacterException();
	}
}
