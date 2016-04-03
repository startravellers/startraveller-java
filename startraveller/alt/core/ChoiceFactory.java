package startraveller.alt.core;

public interface ChoiceFactory {
	Choice make(String choiceName, String... values);
	Choice make(String choiceName, int...values);
}
