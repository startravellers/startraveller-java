package startraveller.alt.core.implementation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import startraveller.alt.core.Characteristic;
import startraveller.alt.core.Choice;
import startraveller.alt.core.ChoiceFactory;
import startraveller.alt.core.Rule;
import startraveller.alt.core.Ruling;
import startraveller.alt.core.implementation.STCharacteristicFactory;
import startraveller.alt.core.implementation.STChoiceFactory;
import startraveller.alt.core.implementation.SimpleRuling;

public class STChoiceFactoryTest {

	@Test
	public void make() {
		ChoiceFactory choiceFactory = new STChoiceFactory(new STCharacteristicFactory());
		Choice chosenAbilityScore = choiceFactory.make(STChoiceFactory.ABILITY_SCORE_CHOICE, 10,10,10,10,10,10);
		Ruling ruling = chosenAbilityScore.validateAgainst(new Rule() {
			@Override
			public Ruling isValid(Characteristic<?>... characteristics) {
				boolean validity = characteristics.length == 10;
				for (Characteristic<?> characteristic : characteristics) {
					validity &= ((Integer)characteristic.value()).equals(Integer.valueOf(10));
				}
				return new SimpleRuling(validity, "");
			}			
		});
		Assert.assertTrue(ruling.isInFavour());
	}
}
