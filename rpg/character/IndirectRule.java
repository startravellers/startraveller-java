package rpg.character;

public abstract class IndirectRule<T> extends Rule<T> implements DisplayCharacterObserver {
	public IndirectRule(Writer writer) {
		super(writer);
	}
}
