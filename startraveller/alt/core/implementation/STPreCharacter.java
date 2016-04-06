package startraveller.alt.core.implementation;

import java.util.ArrayList;
import java.util.List;

import startraveller.alt.core.PreCharacter;
import startraveller.alt.core.Ruling;
import startraveller.alt.core.ValidationStrategy;
import startraveller.alt.core.Characteristic;

public class STPreCharacter implements PreCharacter {
	List<Characteristic<?>> _characteristics = new ArrayList<>();
	
	public STPreCharacter() {}
	@Override
	public void accept(Characteristic<?> characteristic) {
		_characteristics.add(characteristic);
		
	}
	@Override
	public Ruling validate(ValidationStrategy strategy) {
		Characteristic<?>[] characteristics = (Characteristic[]) _characteristics.toArray();
		return strategy.validate(characteristics);
	}
}
