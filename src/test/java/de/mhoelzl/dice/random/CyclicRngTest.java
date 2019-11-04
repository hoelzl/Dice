package de.mhoelzl.dice.random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class CyclicRngTest extends RandomNumberGeneratorTest {
    @Test
    @DisplayName("generate() returns results in correct order and repeatedly")
    void generateCycle() {
        final List<Integer> expected = Arrays.asList(2, 4, 6, 1, 3, 5, 2, 4, 6, 1, 3, 5);

        RandomNumberGenerator generator = getGenerator();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            result.add(generator.generate());
        }

        assertThat(result, equalTo(expected));
    }

    @Override
    RandomNumberGenerator getGenerator() {
        return new CyclicRng(2, 4, 6, 1, 3, 5);
    }
}