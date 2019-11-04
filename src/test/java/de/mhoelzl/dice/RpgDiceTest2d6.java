package de.mhoelzl.dice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    void roll() {
    }

    @Test
    void minValue() {
    }

    @Test
    void maxValue() {
    }
}