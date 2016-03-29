package startraveller.core.implementation.validators;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import core.GameSystem;
import core.PreCharacter;
import startraveller.core.Validator;
import startraveller.core.implementation.choices.SpeciesChoice;

/*
 * This validator does not handle custom species.
 */

public class SpeciesValidator implements Validator {
	@Override
	public boolean validateCharacter(PreCharacter precharacter) {
		Set<String> knownSpecies = new HashSet<>(Arrays.asList(
				"HUMAN",
				"VESP",
				"NYMPH",
				"NIX",
				"JOTUNN",
				"ARCHON",
				"HOMONCULUS",
				"TSUKU"
		));
		try {
			SpeciesChoice speciesChoice = (SpeciesChoice) precharacter.get("Species");
			String species = speciesChoice.getSpecies();
			return species != null && !species.isEmpty() && knownSpecies.contains(species.trim().toUpperCase());
		} catch (ClassCastException e) {
			return false;
		}
	}

}
