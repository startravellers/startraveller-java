package startraveller.alt.core.implementation;

import startraveller.alt.core.Characteristic;

public class STStringCharacteristic implements Characteristic<String> {
	private String _name;
	private String _value;
	
	STStringCharacteristic(String name, String value) {
		_name = name;
		_value = value;
	}
	@Override
	public String getName() {
		return _name;
	}
	@Override
	public String value() {
		return _value;
	}
}
