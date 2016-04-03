package startraveller.alt.core;

public interface CharacteristicFactory {
	Characteristic make(String characteristicName, String value);
	Characteristic make(String characteristicName, int value);
}
