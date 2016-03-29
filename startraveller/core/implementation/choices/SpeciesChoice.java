package startraveller.core.implementation.choices;

import core.Choice;

public class SpeciesChoice implements Choice {
	String _speciesName;
	public SpeciesChoice(String species) {
		_speciesName = species;
	}
	public String getSpecies() {
		return _speciesName;
	}
}
