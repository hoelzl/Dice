package de.mhoelzl.dice.random;

class SimpleRngTest extends RandomNumberGeneratorTest {

    @Override
    RandomNumberGenerator getGenerator() {
        return new SimpleRng(6);
    }
}