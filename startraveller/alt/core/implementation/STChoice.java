package startraveller.alt.core.implementation;

import startraveller.alt.core.Characteristic;
import startraveller.alt.core.Choice;
import startraveller.alt.core.PreCharacter;
import startraveller.alt.core.Rule;
import startraveller.alt.core.Ruling;

public class STChoice implements Choice {
	private Characteristic<?>[] _characteristics;
	private String _choiceName;
	STChoice(Characteristic<?>...characteristics) {
		_characteristics = characteristics.clone();
	}
	@Override
	public Ruling validateAgainst(Rule rule) {
		return rule.isValid(_characteristics);
	}
	@Override
	public void offerTo(PreCharacter preCharacter) {
		for (Characteristic<?> characteristic : _characteristics) {
			preCharacter.accept(characteristic);
		}
	}
	public String getChoiceName() {
		return _choiceName;
	}
}
