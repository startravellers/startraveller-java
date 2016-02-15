package rpg.character;

public class SingleChoiceNoRestrictionsVerifier extends Verifier<SingleChoice> {
	private int _numberOfOptions;
	private SingleChoice _default;
	private String _tag;
	
	public SingleChoiceNoRestrictionsVerifier(String _tag, int numberOfOptions, SingleChoice _default) {
		_numberOfOptions = numberOfOptions;
	}

	@Override
	public boolean verify(SingleChoice choice) {
		if (_tag.equalsIgnoreCase(choice.getTag())) {
			return choice.getChoiceIndex() < _numberOfOptions;
		}
		throw new IllegalArgumentException("SingleChoice " + choice + " not recognized");
	}

	@Override
	public SingleChoice getDefault() {
		return _default;
	}
	
}
