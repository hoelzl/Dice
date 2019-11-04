package de.mhoelzl.dice;

public class MultiRollDice implements Dice {
    private final int numberOfRolls;
    private final Dice containedDice;

    public MultiRollDice(int numberOfRolls, Dice containedDice) {
        this.numberOfRolls = numberOfRolls;
        this.containedDice = containedDice;
    }

    @Override
    public int roll() {
        int result = 0;
        for (int i = 0; i < numberOfRolls; i++) {
            result += containedDice.roll();
        }
        return result;
    }

    @Override
    public int minValue() {
        return numberOfRolls * containedDice.minValue();
    }

    @Override
    public int maxValue() {
        return numberOfRolls * containedDice.maxValue();
    }
}
