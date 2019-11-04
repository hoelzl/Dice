package de.mhoelzl.dice;

import de.mhoelzl.dice.random.CyclicRng;
import de.mhoelzl.dice.random.RandomNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@DisplayName("2d6 Dice")
class RpgDiceTest2d6 {

    @Test
    @DisplayName("can be constructed")
    void canBeConstructed() {
        assertDoesNotThrow(() -> {
            new RpgDice(2, 6);
        });
    }

    @Test
    @DisplayName("roll() returns 5 (when individual rolls are 2 and 3)")
    void roll5() {
        RandomNumberGenerator rng = new CyclicRng(2, 3);
        Dice dice = new RpgDice(2, 6, rng);
        assertThat(dice.roll(), equalTo(5));
    }

    @Test
    @DisplayName("roll() returns 2 (when individual rolls are 1 and 1)")
    void roll2() {
        RandomNumberGenerator rng = new CyclicRng(1);
        Dice dice = new RpgDice(2, 6, rng);
        assertThat(dice.roll(), equalTo(2));
    }

    @Test
    @DisplayName("roll() returns 12 (when individual rolls are 6 and 6)")
    void roll12() {
        RandomNumberGenerator rng = new CyclicRng(6);
        Dice dice = new RpgDice(2, 6, rng);
        assertThat(dice.roll(), equalTo(12));
    }

    @Test
    @DisplayName("minValue() returns 2")
    void minValue() {
        assertThat(new RpgDice(2, 6).minValue(), equalTo(2));
    }

    @Test
    @DisplayName("maxValue() returns 6")
    void maxValue() {
    }
}