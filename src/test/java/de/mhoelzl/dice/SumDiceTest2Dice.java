package de.mhoelzl.dice;

import de.mhoelzl.dice.random.CyclicRng;
import de.mhoelzl.dice.random.RandomNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumDiceTest2Dice {
    private Dice dice;

    SumDiceTest2Dice() {
        RandomNumberGenerator rng1 = new CyclicRng(2, 5, 1, 6);
        Dice d1 = new RpgDice(2, 6, rng1);
        RandomNumberGenerator rng2 = new CyclicRng(17, 8, 1, 20);
        Dice d2 = new RpgDice(2, 20, rng2);
        dice = new SumDice(d1, d2);
    }

    @Test
    @DisplayName("roll() returns 32")
    void roll() {
        assertThat(dice.roll(), equalTo(32));
    }

    @Test
    @DisplayName("minValue() returns 4")
    void minValue() {
        assertThat(dice.minValue(), equalTo(4));
    }

    @Test
    @DisplayName("maxValue() returns 52")
    void maxValue() {
        assertThat(dice.maxValue(), equalTo(52));
    }
}
