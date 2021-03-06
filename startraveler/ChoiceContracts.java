package startraveler;

public interface ChoiceContracts {
	interface AbilityPurchase {
		String TAG = "Ability Purchase";
		String[] ABILITIES = {
				"STRENGTH",
				"DEXTERITY",
				"CONSTITUTION",
				"INTELLIGENCE",
				"WISDOM",
				"CHARISMA"
		};
		int[] DEFAULT_VALUES = new int[] {
				10,
				10,
				10,
				10,
				10,
				10				
		};
		int MIN_VALUE = 7;
		int MAX_VALUE = 18;
		int[] POINT_BUY_CHART = new int[] {
				-4,
				-2,
				-1,
				0,
				1,
				2,
				3,
				4,
				5,
				7,
				10,
				13,
				17
		};
	}
	interface SpeciesChoice {
		String TAG = "Species Choice";
		String[] OPTIONS = new String[] {
				"HUMAN",
				"ARCHON",
				"HOMUNCULUS",
				"TSUKU",
				"NYMPH",
				"JOTUNN",
				"VESP",
				"NIX"
		};
	}
	interface Classes {
		String TAG = "Classes";
		String[] OPTIONS = {
				"SWORDFIEND",
				"MARTIAL ARTIST",
				"DYNAMIC DUO",
				"SHARPSHOOTER",
				"BODYGUARD",
				"ARTILLERY CAPTAIN",
				"BRUTE",
				"GUNSLINGER",
				"FORTRESS",
				"CHAMPION",
				"CON ARTIST",
				"SHIP\'S ENGINEER",
				"RANGER",
				"INFILTRATOR",
				"SCAVENGER",
				"PILOT",
				"STRATEGIST",
				"CALIBRIST",
				"FREERUNNER",
				"MEDEIC",
				"SUPERCHARGER",
				"WEBMASTER",
				"CHRONOGRAPHER",
				"PREDATOR",
				"APOTHECARY",
				"MACABRE",
				"INQUISITOR",
				"JINX"
		};
	}
}
