package de.mhoelzl.dice;

import org.junit.jupiter.api.Disabled;
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
        Dice dice = new RpgDice(2, 6);
        assertThat(dice.roll(), equalTo(5));
    }

    @Disabled
    @Test
    @DisplayName("roll() returns 2 (when individual rolls are 1 and 1)")
    void roll2() {
        Dice dice = new RpgDice(2, 6);
        assertThat(dice.roll(), equalTo(2));
    }


    @Test
    void minValue() {
    }

    @Test
    void maxValue() {
    }
}