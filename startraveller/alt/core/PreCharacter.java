package startraveller.alt.core;

public interface PreCharacter {
	void accept(Characteristic<?> characteristic);
	Ruling validate(ValidationStrategy strategy);
}
