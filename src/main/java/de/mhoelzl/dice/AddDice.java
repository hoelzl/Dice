package de.mhoelzl.dice;

public class AddDice implements Dice {
    private final Dice[] dice;

    public AddDice(Dice... dice) {
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
