/**
 * 
 */
package rpg.character.tests;

import static org.junit.Assert.*;

import rpg.character.*;

import org.junit.Test;

/**
 * @author Mike
 *
 */
public class VerifierTests {

	@Test
	public void booleanTest() {
		BooleanPurchase purchase = new BooleanPurchase(true, true, false);
		
		Verifier<BooleanPurchase> andVerifier = new Verifier<BooleanPurchase>() {
			@Override
			public boolean verify(BooleanPurchase p) {
				return p.b0 && p.b1 && p.b2;
			}

			@Override
			public BooleanPurchase getDefaultPurchase() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		Verifier<BooleanPurchase> orVerifier = new Verifier<BooleanPurchase>() {
			@Override
			public boolean verify(BooleanPurchase p) {
				return p.b0 || p.b1 || p.b2;
			}

			@Override
			public BooleanPurchase getDefaultPurchase() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		assertFalse(andVerifier.verify(purchase));
		assertTrue(orVerifier.verify(purchase));
		}
	
	@Test
	public void stringTest() {
		StringPurchase truePurchase = new StringPurchase("Zerg");
		StringPurchase falsePurchase = new StringPurchase("Vulcan");
		Verifier<StringPurchase> verifier = new Verifier<StringPurchase>() {
			String[] raceList = new String[] {"Human", "Zerg", "Protoss"};			
			@Override
			public boolean verify(StringPurchase purchase) {
				boolean ret = false;
				for (String race : raceList) {
					ret = purchase.race.equalsIgnoreCase(race) || ret;
				}
				return ret;
			}
			@Override
			public StringPurchase getDefaultPurchase() {
				// TODO Auto-generated method stub
				return null;
			}
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		assertTrue(verifier.verify(truePurchase));
		assertFalse(verifier.verify(falsePurchase));
		
	}
	
	@Test
	public void integerTest() {
		IntegerPurchase truePurchase = new IntegerPurchase(2, 3, 5);
		IntegerPurchase falsePurchase = new IntegerPurchase(1, 2, 8);
		
		Verifier<IntegerPurchase> verifier = new Verifier<IntegerPurchase>() {
			@Override
			public boolean verify(IntegerPurchase p) {
				return p.sum() == 10;
			}

			@Override
			public IntegerPurchase getDefaultPurchase() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		assertTrue(verifier.verify(truePurchase));
		assertFalse(verifier.verify(falsePurchase));
	}
	private class BooleanPurchase extends Choice {
		boolean b0;
		boolean b1;
		boolean b2;
		
		BooleanPurchase(boolean b0, boolean b1, boolean b2) {
			super("Boolean Purchase");
			this.b0 = b0;
			this.b1 = b1;
			this.b2 = b2;
		}
	}
	private class StringPurchase extends Choice {
		String race;
		
		StringPurchase(String race) {
			super("String Purchase");
			this.race = race;
		}
	}
	private class IntegerPurchase extends Choice {
		int i0;
		int i1;
		int i2;
		int sum() {
			return i0 + i1 + i2;
		}
		IntegerPurchase(int first, int second, int third) {
			super("Integer Purchase");
			i0 = first;
			i1 = second;
			i2 = third;
		}
	}
}

