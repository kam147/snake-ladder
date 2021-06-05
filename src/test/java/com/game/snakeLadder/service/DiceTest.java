package com.game.snakeLadder.service;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.internal.junit.JUnitTestRule;
import static org.junit.Assert.*;

@RunWith(HierarchicalContextRunner.class)
@Category(JUnitTestRule.class)
public class DiceTest {

    Dice normalDice;

    Dice crookedDice;

    @Before
    public void before(){
        normalDice = new NormalDice();
        crookedDice = new CrookedDice();
    }

    public class NormalDiceTest{

        @Test
        public void it_should_be_return_num_between_1_to_6(){
            Integer number = normalDice.rollDice();
            assertTrue(number<=6 && number>=1);
        }
    }

    public class CrookedDiceTest{

        @Test
        public void it_should_be_return_even_number(){
            Integer number = crookedDice.rollDice();
            assertTrue(number<=6 && number>=1 && number%2==0);
        }
    }

}
