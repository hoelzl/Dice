package de.mhoelzl.dice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DisplayName("ConstantDice with value 3")
class ConstantDiceTest {

    private Dice dice = new ConstantDice(3);

    @Test
    @DisplayName("roll() returns 3")
    void roll() {
        assertThat(dice.roll(), equalTo(3));
    }

    @Test
    @DisplayName("minValue() returns 3")
    void minValue() {
        assertThat(dice.minValue(), equalTo(3));
    }

    @Test
    @DisplayName("maxValue() returns 3")
    void maxValue() {
        assertThat(dice.maxValue(), equalTo(3));
    }
}