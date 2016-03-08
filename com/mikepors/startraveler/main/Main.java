package com.mikepors.startraveler.main;

public class Main {
	public static void main(String[] args) {
		ChoiceFactory choiceFactory = new ChoiceFactory("/StarTraveler/standard/rules.db");
		Choice[] choices = choiceFactory.getStandardChoices();
		CoreCharacter character = new CoreCharacter();
		Validator validator = new Validator();
		
		for (Choice choice : choices) {
			character.chooses(choice);
		}
		DisplayCharacter displayCharacter = validator.validateOrNull(character);
	}
}
