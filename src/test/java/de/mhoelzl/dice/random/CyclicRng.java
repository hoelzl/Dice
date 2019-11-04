package de.mhoelzl.dice.random;

public class CyclicRng implements RandomNumberGenerator {
    private final int[] numbersToGenerate;
    private int index = 0;

    CyclicRng(int... numbersToGenerate) {
        if (numbersToGenerate.length == 0) {
            throw new IllegalArgumentException("CyclicRng needs at least one output number");
        }
        this.numbersToGenerate = numbersToGenerate;
    }

    @Override
    public int generate() {
        int result = numbersToGenerate[index];
        index = (index + 1) % numbersToGenerate.length;
        return result;
    }

    @Override
    public int minValue() {
        int result = numbersToGenerate[0];
        for (int i : numbersToGenerate) {
            if (i < result) {
                result = i;
            }
        }
        return result;
    }

    @Override
    public int maxValue() {
        int result = numbersToGenerate[0];
        for (int i : numbersToGenerate) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }
}
