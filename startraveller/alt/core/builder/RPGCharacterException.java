package startraveller.alt.core.builder;

import startraveller.alt.core.Ruling;

public class RPGCharacterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8138073322577671925L;
	public RPGCharacterException() {
		super();
	}
	public RPGCharacterException(String message) {
		super(message);
	}
	public RPGCharacterException(Ruling ruling) {
		super(ruling.details());
	}
}
