package startraveler.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import startraveler.AbilityPurchase;
import startraveler.AbilityPointBuyVerifier;

public class AbilityPointBuyVerifierTest {

	private AbilityPurchase purchase;
	private AbilityPointBuyVerifier verifier = new AbilityPointBuyVerifier();
;

	@After
	public void tearDown() {
		purchase = null;
	}

	@Test
	public void defaultPurchaseIsLegal() {
		assertTrue(verifier.verify(verifier.getDefaultPurchase()));
	}
	
	@Test
	public void lowerThanMinIsIllegal() {
		purchase = new AbilityPurchase(6, 10, 10, 10, 10, 10);
		assertFalse(verifier.verify(purchase));
	}
	@Test
	public void higherThanMaxIsIllegal() {
		purchase = new AbilityPurchase(10, 10, 10, 20, 10, 10);
		assertFalse(verifier.verify(purchase));
	}
	@Test
	public void tooManyPointsSpentIsIllegal() {
		purchase = new AbilityPurchase(13, 11, 13, 13, 13, 13);
		assertFalse(verifier.verify(purchase));
	}
	@Test
	public void canHitMaxValue() {
		purchase = new AbilityPurchase(10, 10, 10, 10, 8, 18);
		assertTrue(verifier.verify(purchase));
	}
	@Test
	public void canHitMinValue() {
		purchase = new AbilityPurchase(12, 12, 7, 12, 8, 17);
		assertTrue(verifier.verify(purchase));
	}
	@Test
	public void canSpendAllPoints() {
		purchase = new AbilityPurchase(15, 12, 13, 10, 11, 12);
		assertTrue(verifier.verify(purchase));
	}
	
}
