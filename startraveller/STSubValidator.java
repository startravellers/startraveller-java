package startraveller;

import core.Character;
import core.GameSystem;
import core.PreCharacter;
import core.Validator;

public class STSubValidator implements Validator {
	public DisplayCharacter validateOrNull(PreCharacter character) {
		return null;
	}

	@Override
	public boolean validateGameSystem(GameSystem gameSystem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateCharacter(Character character, GameSystem gameSystem) {
		// TODO Auto-generated method stub
		return false;
	}
}
