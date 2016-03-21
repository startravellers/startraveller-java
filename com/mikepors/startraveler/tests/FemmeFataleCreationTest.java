package com.mikepors.startraveler.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mikepors.startraveler.main.*;

public class FemmeFataleCreationTest {

	@Test
	public void createFemmeFataleCharacter() {
		StarTravelerCharacter character = new StarTravelerCharacterBuilder()
				.chooseName("Nikita")
				.chooseGender("Female")
				.chooseSex("Female")
				.chooseStrength(13)//3
				.chooseDexterity(15)//7
				.chooseConstitution(11)//1
				.chooseIntelligence(10)//0
				.chooseWisdom(9)//-1
				.chooseCharisma(14)//5
				.chooseSpecies("NYMPH")//+3 CHA -2 WIS +2 Diplomacy +2 Acrobatics +10 Save vs. Disease
				.chooseSpecializations(
						"CON ARTIST",
						"FREE RUNNER",
						"MACABRE"
				)
				.chooseAbilities(
						"DUCK AND WEAVE",
						"BLOOD LUST"
				)
				.build();
		
		Assert.assertNotNull(character);
		Assert.assertEquals(character.getName(), "Nikita");
		Assert.assertEquals(character.getGender(), "Female");
		Assert.assertEquals(character.getSex(), "Female");
		Assert.assertEquals(character.getStrength(), 13);
		Assert.assertEquals(character.getDexterity(), 15);
		Assert.assertEquals(character.getConstitution(), 11);
		Assert.assertEquals(character.getIntelligence(), 10);
		Assert.assertEquals(character.getWisdom(), 7);
		Assert.assertEquals(character.getCharisma(), 17);
		
		}
}
