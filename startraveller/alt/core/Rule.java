package startraveller.alt.core;

public interface Rule {
	Ruling isValid(Characteristic... characteristics);
}
