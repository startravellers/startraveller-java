package rpg.character;

public class PointBuy extends Choice {
	private int[] _scores;
	private String[] _categories;
	
	public PointBuy(String tag, int[] scores, String[] categories){
		super(tag);
		_scores = scores.clone();
		_categories = categories.clone();
	}
	public int[] getScores() {
		return _scores;
	}
	public String[] getCategories() {
		return _categories;
	}
}
