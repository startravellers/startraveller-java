package startraveller.alt.core.implementation;

import startraveller.alt.core.Characteristic;

public class STNumericCharacteristic implements Characteristic<Integer>{
	private String _name;
	private int _value;
	
	public STNumericCharacteristic(String name, int value) {
		_name = name;
		_value = value;
	}	
	@Override
	public String getName() {
		return _name;
	}
	@Override
	public Integer value() {
		return Integer.valueOf(_value);
	}
}