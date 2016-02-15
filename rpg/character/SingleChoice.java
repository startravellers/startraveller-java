package rpg.character;

public class SingleChoice extends Choice {
	private int _index;
	private String[] _options;
	protected SingleChoice(String tag, int index, String[] options) {
		super(tag);
		_index = index;
		_options = options.clone();
	}
	public int getChoiceIndex() {
		return _index;
	}
	public String[] getOptions() {
		return _options.clone();
	}
}
