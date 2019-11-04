package de.mhoelzl.dice;

public class RpgDice implements Dice {
    private final int numDice;
    private final int sides;

    public RpgDice(int numDice, int sides) {
        this.numDice = numDice;
        this.sides = sides;
    }

    @Override
    public int roll() {
        return 0;
    }

    @Override
    public int minValue() {
        return 0;
    }

    @Override
    public int maxValue() {
        return 0;
    }
}
