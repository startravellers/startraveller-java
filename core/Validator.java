package core;

public interface Validator {
	boolean validateGameSystem(GameSystem gameSystem);
	boolean validateCharacter(Character character, GameSystem gameSystem);
}