package de.mhoelzl.dice.random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

abstract class RandomNumberGeneratorTest {
    static Set<Integer> generateResultSet(int minValue, int maxValue) {
        Set<Integer> result = new HashSet<>(maxValue - minValue + 1);
        for (int i = minValue; i <= maxValue; i++) {
            result.add(i);
        }
        assert result.size() == maxValue - minValue + 1;
        return result;
    }

    @Test
    @DisplayName("generate() returns a number between minValue() and maxValue()")
    void generate() {
        RandomNumberGenerator generator = getGenerator();
        int result = generator.generate();
        assertThat(result, greaterThanOrEqualTo(generator.minValue()));
        assertThat(result, lessThanOrEqualTo(generator.maxValue()));
    }

    @Test
    @DisplayName("generate() generates all numbers between minValue() and maxValue() when run often enough")
    void generateAll() {
        RandomNumberGenerator generator = getGenerator();
        Set<Integer> allResults = generateResultSet(generator.minValue(), generator.maxValue());
        // Pick a number of iterations so that the probability of generating all values in the range
        // is approximately 1.
        int range = generator.maxValue() - generator.minValue() + 1;
        final int numIterations = 10 * range * range;
        for (int i = 0; i < numIterations; i++) {
            System.out.print(".");
            allResults.remove(generator.generate());
            if (allResults.isEmpty()) {
                break;
            }
        }
        assertThat("generate() did not generate all possible values", allResults, empty());
    }

    abstract RandomNumberGenerator getGenerator();
}