package rpg.character;

public class Declaration extends Choice {
	private String _declaration;
	protected Declaration(String tag, String declaration) {
		super(tag);
		_declaration = declaration;
	}
	public String getChoice() {
		return _declaration;
	}
}
