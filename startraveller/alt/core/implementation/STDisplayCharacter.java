package startraveller.alt.core.implementation;

import java.util.ArrayList;
import java.util.List;

import startraveller.alt.core.Characteristic;
import startraveller.alt.core.DisplayCharacter;

public class STDisplayCharacter implements DisplayCharacter {
	List<Characteristic<?>> _characteristics = new ArrayList<>();
	@Override
	public void add(Characteristic<?> characteristic) {
		_characteristics.add(characteristic);

	}

}
