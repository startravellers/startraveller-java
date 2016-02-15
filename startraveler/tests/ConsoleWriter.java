package startraveler.tests;

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

}
