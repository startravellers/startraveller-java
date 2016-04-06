package startraveller.alt.core.implementation;

import startraveller.alt.core.Characteristic;

public class STNumericCharacteristic implements Characteristic {
	private String _name;
	private int _value;
	
	public STNumericCharacteristic(String name, int value) {
		_name = name;
		_value = value;
	}	
	public String getName() {
		return _name;
	}
	private int getValue() {
		return _value;
	}
}
