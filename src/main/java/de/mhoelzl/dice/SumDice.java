package de.mhoelzl.dice;

public class SumDice implements Dice {
    private final Dice[] dice;

    public SumDice(Dice... dice) {
        this.dice = dice;
    }

    @Override
    public int roll() {
        int result = 0;
        for (Dice d : dice) {
            result += d.roll();
        }
        return result;
    }

    @Override
    public int minValue() {
        int result = 0;
        for (Dice d : dice) {
            result += d.minValue();
        }
        return result;
    }

    @Override
    public int maxValue() {
        int result = 0;
        for (Dice d : dice) {
            result += d.maxValue();
        }
        return result;

    }
}
