package startraveller.alt.core;

public interface Choice {
	Ruling validateAgainst(Rule rule);
	void offerTo(PreCharacter preCharacter);
	String getChoiceName();
}
