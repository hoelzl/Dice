package de.mhoelzl.dice;

import de.mhoelzl.dice.random.CyclicRng;
import de.mhoelzl.dice.random.RandomNumberGenerator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class SimpleDieTestD6 {

    @Test
    void roll() {
        RandomNumberGenerator rng = new CyclicRng(3);
        Dice dice = new SimpleDie(6, rng);
        assertThat(dice.roll(), equalTo(3));
    }

    @Test
    void minValue() {
        Dice dice = new SimpleDie(6);
        assertThat(dice.minValue(), equalTo(1));
    }

    @Test
    void maxValue() {
        Dice dice = new SimpleDie(6);
        assertThat(dice.maxValue(), equalTo(6));
    }
}