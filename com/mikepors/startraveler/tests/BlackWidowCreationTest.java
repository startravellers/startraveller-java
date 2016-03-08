package com.mikepors.startraveler.tests;

import java.util.List;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mikepors.startraveler.main.*;
import static com.mikepors.startraveler.main.ChoiceFactory.*;

public class BlackWidowCreationTest {
	private String _dbAddress = "/Startraveler/standardrules/rules.db";
	private ChoiceFactory _choiceFactory;
	private Validator _validator = new Validator();

	@BeforeTest
	public void setupChoiceFactory() {
		_choiceFactory = new ChoiceFactory(_dbAddress);
	}
	@Test
	public void createBlackWidowCharacter() {
		CharacterBuilder builder = new DisplayCharacter.CharacterBuilder(_validator);
		builder.chooses(_choiceFactory.getName("Nikita"));
		builder.chooses(_choiceFactory.getGender("Female"));
		builder.chooses(_choiceFactory.getBaseAbilityScoreBuilder()
						.setStrength(13)//4
						.setDexterity(15)
						.setConstitution(11)
						.setIntelligence(10)
						.setWisdom(9)
						.setCharisma(15)
						.build()
				);
		builder.chooses(_choiceFactory.getSpecies(Species.NYMPH));//+3 CHA -2 WIS
		builder.chooses(_choiceFactory.getSpecializations(
								Specialization.CON_ARTIST,
								Specialization.FREE_RUNNER,
								Specialization.MACABRE
						)
				);
		builder.chooses(_choiceFactory.getAbility(
								Abilities.FreeRunner.DUCK_AND_WEAVE,
								Abilities.Macabre.BLOOD_LUST
						)
				);
		DisplayCharacter character = builder.buildOrNull();
		Assert.assertNotNull(character);
		Assert.assertEquals(character.getName(), "Nikita");
		Assert.assertEquals(character.getGender(), "Female");
		Assert.assertEquals(character.getAbilityScore("Strength"), 13);
		Assert.assertEquals(character.getAbilityScore("Dexterity"), 15);
		Assert.assertEquals(character.getAbilityScore("Constitution"), 11);
		Assert.assertEquals(character.getAbilityScore("Intelligence"), 10);
		Assert.assertEquals(character.getAbilityScore("Wisdom"), 7);
		Assert.assertEquals(character.getAbilityScore("Charisma"), 18);
		
		}
}
