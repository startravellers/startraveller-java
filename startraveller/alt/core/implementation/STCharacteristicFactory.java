package startraveller.alt.core.implementation;

import startraveller.alt.core.CharacteristicFactory;

public class STCharacteristicFactory implements CharacteristicFactory {

	@Override
	public STStringCharacteristic make(String characteristicName, String value) {
		return new STStringCharacteristic(characteristicName, value);
	}

	@Override
	public STNumericCharacteristic make(String characteristicName, int value) {
		return new STNumericCharacteristic(characteristicName, value);
	}
	
}
