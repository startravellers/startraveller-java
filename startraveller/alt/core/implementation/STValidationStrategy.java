package startraveller.alt.core.implementation;

import java.util.HashMap;
import java.util.Map;

import startraveller.alt.core.Characteristic;
import startraveller.alt.core.Rule;
import startraveller.alt.core.Ruling;
import startraveller.alt.core.ValidationStrategy;

public class STValidationStrategy implements ValidationStrategy {
	Map<String, Rule> _rulebook = new HashMap<>();
	@Override
	public Ruling validate(Characteristic... characteristics) {
		//Sort characteristics into a map, then look through all characteristics for corresponding rules and validate against them
		return null;
	}

}
