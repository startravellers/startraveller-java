package startraveller.alt.core.implementation;

import java.util.Map;

import startraveller.alt.core.Characteristic;
import startraveller.alt.core.CharacteristicFactory;
import startraveller.alt.core.Choice;
import startraveller.alt.core.ChoiceFactory;

public class STChoiceFactory implements ChoiceFactory {
	private CharacteristicFactory _characteristicFactory;
	private Map<String, String[]> _nameMap;
	
	public STChoiceFactory(CharacteristicFactory characteristicFactory) {
		_characteristicFactory = characteristicFactory;
	}

	@Override
	public Choice make(String choiceName, String... values) {
		String[] characteristicNames = _nameMap.get(choiceName);
		Characteristic[] characteristics;
		if (values.length != characteristicNames.length) {
			throw new IllegalArgumentException("Incorrect number of arguments");
		} else {
			characteristics = new Characteristic[values.length]; 
			for (int i = 0; i < values.length; i++){
				characteristics[i] = 
						_characteristicFactory.make(
								characteristicNames[i],
								values[i]
						);
			}
		}
		return wrap(characteristics);
	}

	@Override
	public Choice make(String choiceName, int... values) {
		String[] characteristicNames = _nameMap.get(choiceName);
		Characteristic[] characteristics;
		if (values.length != characteristicNames.length) {
			throw new IllegalArgumentException("Incorrect number of arguments");
		} else {
			characteristics = new Characteristic[values.length];
			for (int i = 0; i < values.length; i++){
				characteristics[i] = 
						_characteristicFactory.make(
								characteristicNames[i],
								values[i]
						);
			}
		}
		return wrap(characteristics);
	}

	protected Choice wrap(Characteristic... characteristics) {
		return new STChoice(characteristics);
	}
}
