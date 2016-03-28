package core.builder;

public class IllegalChoiceException extends Exception {

	private static final long serialVersionUID = -3649981356098777879L;
	public IllegalChoiceException(String message) {
		super(message);
	}
	public IllegalChoiceException() {
		super();
	}
}
