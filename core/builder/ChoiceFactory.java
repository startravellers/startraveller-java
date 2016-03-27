package core.builder;

import core.Choice;

public interface ChoiceFactory {
	Choice create(String id, String... args);
	Choice create(String id, int... args);
}
