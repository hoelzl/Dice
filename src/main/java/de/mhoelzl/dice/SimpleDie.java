package de.mhoelzl.dice;

import de.mhoelzl.dice.random.RandomNumberGenerator;
import de.mhoelzl.dice.random.SimpleRng;

public class SimpleDie implements Dice {
    private final RandomNumberGenerator rng;

    public SimpleDie(int numberOfSides, RandomNumberGenerator rng) {
        this.rng = rng;
    }

    public SimpleDie(int numberOfSides) {
        this(numberOfSides, new SimpleRng(numberOfSides));
    }

    @Override
    public int roll() {
        return rng.generate();
    }

    @Override
    public int minValue() {
        return rng.minValue();
    }

    @Override
    public int maxValue() {
        return rng.maxValue();
    }
}
