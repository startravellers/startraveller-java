package abstractimplementation;

import java.util.HashMap;
import java.util.Map;

import core.GameSystem;
import core.PreCharacter;
import core.Validator;

public class AbstractValidator implements Validator {
	protected Map<String, Validator> _validators = new HashMap<String, Validator>();
	public void register(String id, Validator validator) {
		_validators.put(id, validator);
	}
	public void unregister(String id){
		_validators.remove(id);
	}
	@Override
	public boolean validateGameSystem(GameSystem gameSystem) {
		return true;
	}
	@Override
	public boolean validateCharacter(PreCharacter precharacter, GameSystem gameSystem) {
		for (Validator validator : _validators.values()) {
			if (!validator.validateCharacter(precharacter, gameSystem)) {
				return false;
			}
		}
		return true;
	}
}
