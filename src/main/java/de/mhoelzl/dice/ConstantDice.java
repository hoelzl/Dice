package de.mhoelzl.dice;

public class ConstantDice implements Dice {
    private final int result;

    public ConstantDice(int result) {
        this.result = result;
    }

    @Override
    public int roll() {
        return result;
    }

    @Override
    public int minValue() {
        return result;
    }

    @Override
    public int maxValue() {
        return result;
    }
}
