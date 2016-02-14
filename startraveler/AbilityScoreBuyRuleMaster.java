package startraveler;

import rpg.character.RuleMaster;
import rpg.character.Writer;

public class AbilityScoreBuyRuleMaster extends RuleMaster {
	AbilityScoreBuyRuleMaster(Writer writer){
		super(writer);
	}
	public void provideInstructions(AbilityPurchase purchase) {
		String[] categories = purchase.getCategories();
		int[] scores = purchase.getScores();
		for (int i = 0; i < categories.length; i++) {
		_writer.add(purchase.getTag(), "Base " + categories[i].toLowerCase(), scores[i]);
		_writer.add(purchase.getTag(), "Base " + categories[i] + " Modifer", (float)((scores[i] - 10)/2.0));
		}
	}
}
