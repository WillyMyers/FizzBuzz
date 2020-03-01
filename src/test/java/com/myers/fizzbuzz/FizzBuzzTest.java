package com.myers.fizzbuzz;

import com.myers.fizzbuzz.factory.FizzBuzzFactory;
import com.myers.fizzbuzz.game.Game;
import org.junit.Test;

import static com.myers.fizzbuzz.common.Constants.*;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    Game fizzBuzz = FizzBuzzFactory.getFizzBuzzGame();

    //Happy path tests
    @Test
    public void testCorrectAnswerFor3() {
        assertEquals(FIZZ, fizzBuzz.play(3));
    }

    @Test
    public void testCorrectAnswerFor5(){
        assertEquals(BUZZ, fizzBuzz.play(5));
    }

    @Test
    public void testCorrectAnswerFor15(){
        assertEquals(FIZZBUZZ, fizzBuzz.play(15));
    }

    @Test
    public void testCorrectAnswerFor2(){
        assertEquals("2", fizzBuzz.play(2));
    }

    //These are out of the range of the game but if passed will not throw an error, this may or may not be the desired behaviour
    @Test
    public void testCorrectAnswerFor0(){
        assertEquals("0", fizzBuzz.play(0));
    }

    @Test
    public void testCorrectAnswerForMinus1(){
        assertEquals("-1", fizzBuzz.play(-1));
    }
}
