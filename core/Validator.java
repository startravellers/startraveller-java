package core;

public interface Validator {
	boolean validateGameSystem(GameSystem gameSystem);
	boolean validateCharacter(PreCharacter precharacter, GameSystem gameSystem);
}