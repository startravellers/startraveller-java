package rpg.character;

public abstract class RuleMaster<T extends Choice> {
	protected Writer _writer;
	public RuleMaster(Writer writer){
		_writer = writer;
	}
	public abstract void write(T choice);
}
