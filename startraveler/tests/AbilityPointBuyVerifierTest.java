package startraveler.tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import rpg.character.PointBuy;
import rpg.character.PointBuyVerifier;
import startraveler.ChoiceFactory;
import startraveler.VerifierFactory;

public class AbilityPointBuyVerifierTest {

	private PointBuy purchase;
	private static PointBuyVerifier verifier;
	private static ChoiceFactory choiceFactory;
	
	@BeforeClass
	public static void initialSetup() {
		choiceFactory = new ChoiceFactory();
		verifier = new VerifierFactory().getAbilityPointBuyVerifier();
	}
	@AfterClass
	public static void finalTeardown() {
		choiceFactory = null;
		verifier = null;
	}
	@After
	public void tearDown() {
		purchase = null;
	}

	@Test
	public void defaultPurchaseIsLegal() {
		assertTrue(verifier.verify(verifier.getDefault()));
	}
	
	@Test
	public void lowerThanMinIsIllegal() {
		purchase = choiceFactory.getAbilityPurchase(6, 10, 10, 10, 10, 10);
		assertFalse(verifier.verify(purchase));
	}
	@Test
	public void higherThanMaxIsIllegal() {
		purchase = choiceFactory.getAbilityPurchase(10, 10, 10, 20, 10, 10);
		assertFalse(verifier.verify(purchase));
	}
	@Test
	public void tooManyPointsSpentIsIllegal() {
		purchase = choiceFactory.getAbilityPurchase(13, 11, 13, 13, 13, 13);
		assertFalse(verifier.verify(purchase));
	}
	@Test
	public void canHitMaxValue() {
		purchase = choiceFactory.getAbilityPurchase(10, 10, 10, 10, 8, 18);
		assertTrue(verifier.verify(purchase));
	}
	@Test
	public void canHitMinValue() {
		purchase = choiceFactory.getAbilityPurchase(12, 12, 7, 12, 8, 17);
		assertTrue(verifier.verify(purchase));
	}
	@Test
	public void canSpendAllPoints() {
		purchase = choiceFactory.getAbilityPurchase(15, 12, 13, 10, 11, 12);
		assertTrue(verifier.verify(purchase));
	}
	
}
