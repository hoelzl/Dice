package de.mhoelzl.dice.random;

public interface RandomNumberGenerator {
    /// Generate a random number in the generator's range
    int generate();

    /// The minimum value that generate() can return
    int minValue();

    /// The maximum value that generate() can return
    int maxValue();
}
