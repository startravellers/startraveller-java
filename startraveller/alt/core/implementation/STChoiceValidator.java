package startraveller.alt.core.implementation;

import java.util.Map;

import startraveller.alt.core.Choice;
import startraveller.alt.core.ChoiceValidator;
import startraveller.alt.core.Rule;
import startraveller.alt.core.Ruling;

public class STChoiceValidator implements ChoiceValidator {
	private Map<String, Rule> _rulebook;
	public STChoiceValidator() {}
	public void registerRule(String name, Rule rule) {
		_rulebook.put(name, rule);
	}
	public void unregisterRule(String name, Rule rule) {
		_rulebook.remove(name);
	}
	@Override
	public Ruling isLegal(Choice choice) {
		Rule rule = _rulebook.get(choice.getChoiceName());
		return choice.validateAgainst(rule);
	}
}
