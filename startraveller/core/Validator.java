package startraveller.core;

import core.GameSystem;
import core.PreCharacter;

public interface Validator extends core.Validator {
	@Override
	default boolean validateGameSystem(GameSystem gameSystem) {
		return true;
	}
	@Override
	default boolean validateCharacter(PreCharacter precharacter, GameSystem gameSystem) {
		return validateCharacter(precharacter);
	}
	boolean validateCharacter(PreCharacter precharacter);
}
