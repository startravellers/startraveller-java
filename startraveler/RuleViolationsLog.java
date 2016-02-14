package startraveler;

import rpg.character.Choice;
import rpg.character.Verifier;

public class RuleViolationsLog {
	private static RuleViolationsLog instance;
	
	public static RuleViolationsLog getInstance() {
		return instance != null ? instance : (instance = new RuleViolationsLog());
	}
	
	private RuleViolationsLog() {};
	
	public <P extends Choice> void record(Verifier<P> context, String ruleViolation) {
		System.out.println(context.toString() + ": " + ruleViolation);
	}
}
