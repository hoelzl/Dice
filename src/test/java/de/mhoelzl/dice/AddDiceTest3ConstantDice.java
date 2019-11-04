package de.mhoelzl.dice;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class AddDiceTest3ConstantDice {
    private Dice dice;

    AddDiceTest3ConstantDice() {
        Dice d1 = new ConstantDice(1);
        Dice d2 = new ConstantDice(2);
        Dice d3 = new ConstantDice(3);
        dice = new AddDice(d1, d2, d3);
    }

    @Test
    void roll() {
        assertThat(dice.roll(), equalTo(6));
    }

    @Test
    void minValue() {
        assertThat(dice.minValue(), equalTo(6));
    }

    @Test
    void maxValue() {
        assertThat(dice.maxValue(), equalTo(6));
    }
}