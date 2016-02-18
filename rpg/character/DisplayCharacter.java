package rpg.character;

import java.util.Set;
import java.util.HashSet;

public abstract class DisplayCharacter {
	Set<DisplayCharacterObserver> observers = new HashSet<>();
	public void addDisplayCharacterObserver(DisplayCharacterObserver observer){
		observers.add(observer);
	}
	public void addRemoveDisplayCharacterObserver(DisplayCharacterObserver observer) {
		observers.remove(observer);
	}
}
