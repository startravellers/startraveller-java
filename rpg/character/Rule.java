package rpg.character;

public abstract class Rule<T> {
	protected Writer _writer;
	public abstract void applyRule(T ressource);
	
	public Rule(Writer writer) {
		_writer = writer;
	}
}