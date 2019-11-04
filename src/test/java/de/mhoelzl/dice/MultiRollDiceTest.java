package de.mhoelzl.dice;

import de.mhoelzl.dice.random.CyclicRng;
import de.mhoelzl.dice.random.RandomNumberGenerator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class MultiRollDiceTest {
    private Dice dice;

    public MultiRollDiceTest() {
        RandomNumberGenerator rng = new CyclicRng(3, 1, 6);
        Dice d = new SimpleDie(6, rng);
        this.dice = new MultiRollDice(2, d);
    }

    @Test
    void roll() {
        assertThat(dice.roll(), equalTo(3 + 1));
    }

    @Test
    void minValue() {
        assertThat(dice.minValue(), equalTo(2));
    }

    @Test
    void maxValue() {
        assertThat(dice.maxValue(), equalTo(12));
    }
}
