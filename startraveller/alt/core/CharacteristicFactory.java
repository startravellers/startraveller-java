package startraveller.alt.core;

public interface CharacteristicFactory {
	Characteristic<String> make(String characteristicName, String value);
	Characteristic<Integer> make(String characteristicName, int value);
}
