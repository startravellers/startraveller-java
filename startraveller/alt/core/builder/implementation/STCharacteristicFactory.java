package startraveller.alt.core.builder.implementation;

import startraveller.alt.core.Characteristic;
import startraveller.alt.core.CharacteristicFactory;

public class STCharacteristicFactory implements CharacteristicFactory {

	@Override
	public STStringCharacteristic make(String characteristicName, String value) {
		return new STStringCharacteristic(characteristicName, value);
	}

	@Override
	public Characteristic make(String characteristicName, int value) {
		return new STNumericCharacteristic(characteristicName, value);
	}
	
}
