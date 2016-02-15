package rpg.character;

public class MultipleChoice extends Choice {
	int[] _choices;
	public MultipleChoice(String tag, int[] indices) {
		super(tag);
		_choices = indices.clone();
	}
}
