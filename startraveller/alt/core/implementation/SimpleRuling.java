package startraveller.alt.core.implementation;

import startraveller.alt.core.Ruling;

public class SimpleRuling implements Ruling {
	private boolean _result;
	private String _details;
	
	public SimpleRuling(boolean result, String details) {
		_result = result;
		_details = details;
	}
	@Override
	public boolean isInFavour() {
		return _result;
	}
	@Override
	public String details() {
		return _details;
	}
}
