package startraveller.alt.core.implementation;

import startraveller.alt.core.Characteristic;
import startraveller.alt.core.Rule;
import startraveller.alt.core.Ruling;

public class SimpleRule implements Rule {
	
	public SimpleRule(){}

	@Override
	public Ruling isValid(Characteristic<?>... characteristics) {
		// TODO Auto-generated method stub
		return new SimpleRuling(false, "");
	}

}
