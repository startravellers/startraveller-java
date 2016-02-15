package rpg.character;

public abstract class Verifier<P extends Choice> {
	public abstract boolean verify(P purchase);
	public abstract P getDefaultPurchase();
}
