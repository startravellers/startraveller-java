package startraveller.core.implementation.choices;

import core.Choice;

public class AbilityScoreChoice implements Choice {
	private int _strength;
	private int _dexterity;
	private int _constitution;
	private int _intelligence;
	private int _wisdom;
	private int _charisma;
	public AbilityScoreChoice(
			int strength,
			int dexterity,
			int constitution,
			int intelligence,
			int wisdom,
			int charisma
	) {
		_strength = strength;
		_dexterity = dexterity;
		_constitution = constitution;
		_intelligence = intelligence;
		_wisdom = wisdom;
		_charisma = charisma;
	}
	public int getStrength() {
	public int getDexterity() {
	public int getConstitution() {
	public int getIntelligence() {
	public int getWisdom() {
	public int getCharisma() {
	public int[] getScores() {
		return new int[] {_strength, _dexterity, _intelligence, _constitution, _wisdom, _charisma};
	}
}