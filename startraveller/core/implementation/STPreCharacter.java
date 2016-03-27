package startraveller.core.implementation;

import java.util.ArrayList;
import java.util.List;

import core.Choice;
import core.PreCharacter;

/*
 * Naive implementation of the PreCharacter interface for StarTraveller.
 * 
 *  TODO: Un-naive-ifty
 */

public class STPreCharacter implements PreCharacter {
	List<Choice> _choices;
	
	public STPreCharacter() {
		_choices = new ArrayList<>();
	}

	@Override
	public void accept(Choice choice) {
		_choices.add(choice);
		
	}

}
