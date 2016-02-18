package startraveler;

import rpg.character.PointBuy;
import rpg.character.Rule;
import rpg.character.Writer;

public class AbilityScoreBuyRuleMaster extends Rule<PointBuy> {
	AbilityScoreBuyRuleMaster(Writer writer){
		super(writer);
	}
	public void applyRule(PointBuy pointBuy) {
		if (!pointBuy.getTag().equalsIgnoreCase(ChoiceContracts.AbilityPurchase.TAG)) {
			throw new IllegalArgumentException("PointBuy " + pointBuy + " not recognized");
		}
		String[] categories = pointBuy.getCategories();
		int[] scores = pointBuy.getScores();
		for (int i = 0; i < categories.length; i++) {
		_writer.add(pointBuy.getTag(), "Base " + categories[i].toLowerCase(), scores[i]);
		_writer.add(pointBuy.getTag(), "Base " + categories[i] + " Modifer", (float)((scores[i] - 10)/2.0));
		}
	}
}
