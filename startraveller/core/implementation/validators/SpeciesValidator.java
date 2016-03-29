package startraveller.core.implementation.validators;

import core.GameSystem;
import core.PreCharacter;
import startraveller.core.Validator;
import startraveller.core.implementation.choices.SpeciesChoice;

public class SpeciesValidator implements Validator {
	@Override
	public boolean validateCharacter(PreCharacter precharacter) {
		try {
			SpeciesChoice speciesChoice = (SpeciesChoice) precharacter.get("Species");
			String species = speciesChoice.getSpecies();
			return species != null && !species.isEmpty();
		} catch (ClassCastException e) {
			return false;
		}
	}

}
