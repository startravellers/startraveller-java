package startraveller.alt.core.implementation;

import startraveller.alt.core.Characteristic;

public class STStringCharacteristic implements Characteristic {
	private String _name;
	private String _value;
	
	STStringCharacteristic(String name, String value) {
		_name = name;
		_value = value;
	}
	
	public String getName() {
		return _name;
	}
	public String getValue() {
		return _value;
	}
}
