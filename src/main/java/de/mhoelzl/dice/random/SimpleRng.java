package de.mhoelzl.dice.random;

import java.util.Random;

/// A random number generator that returns a number between 1 and max (inclusive)
public class SimpleRng implements RandomNumberGenerator {
    private final int max;
    private final Random random = new Random();

    public SimpleRng(int max) {
        this.max = max;
    }

    @Override
    public int generate() {
        return random.nextInt(max) + 1;
    }

    @Override
    public int minValue() {
        return 1;
    }

    @Override
    public int maxValue() {
        return max;
    }
}
