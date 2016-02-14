package rpg.character;

public abstract class Choice {
	private String _tag;
	protected Choice(String tag) {
		_tag = tag;
	}
	public String getTag() {
		return _tag;
	}
}
