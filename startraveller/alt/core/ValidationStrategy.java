package startraveller.alt.core;

public interface ValidationStrategy {
	Ruling validate(Characteristic<?>...characteristics);
}
