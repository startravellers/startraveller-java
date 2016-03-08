package rpg.character;

public abstract class Writer {
	public abstract void add(String sourceTag, String effectName, int value);
	public abstract void add(String sourceTag, String effectName, float value);
	public abstract void registerRule(IndirectRule<?> rule);
	public abstract void unregisterRule(IndirectRule<?> rule);
	public abstract void notifyListeners();
}
