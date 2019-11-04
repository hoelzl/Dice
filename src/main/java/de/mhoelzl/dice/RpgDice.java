package de.mhoelzl.dice;

import de.mhoelzl.dice.random.RandomNumberGenerator;
import de.mhoelzl.dice.random.SimpleRng;

public class RpgDice implements Dice {
    private final int numDice;
    private final int sides;
    private final RandomNumberGenerator rng;

    public RpgDice(int numDice, int sides, RandomNumberGenerator rng) {
        this.numDice = numDice;
        this.sides = sides;
        this.rng = rng;
    }

    public RpgDice(int numDice, int sides) {
        this(numDice, sides, new SimpleRng(sides));
    }

    @Override
    public int roll() {
        int result = 0;
        for (int i = 0; i < numDice; i++) {
            result += rng.generate();
        }
        return result;
    }

    @Override
    public int minValue() {
        return numDice * rng.minValue();
    }

    @Override
    public int maxValue() {
        return 0;
    }
}
