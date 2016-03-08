package startraveler.tests;

import rpg.character.IndirectRule;
import rpg.character.Writer;

public class ConsoleWriter extends Writer {

	@Override
	public void add(String sourceTag, String effectName, int value) {
		System.out.println(sourceTag + " " + effectName + " " + value);
	}

	@Override
	public void add(String sourceTag, String effectName, float value) {
		System.out.println(sourceTag + " " + effectName + " " + value);
	}
	@Override
	public void registerRule(IndirectRule<?> rule) {}
	@Override
	public void unregisterRule(IndirectRule<?> rule){}

	@Override
	public void notifyListeners() {
		// TODO Auto-generated method stub
		
	}

}
