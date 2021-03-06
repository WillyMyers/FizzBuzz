package com.myers.fizzbuzz.game;

import com.myers.fizzbuzz.factory.FizzBuzzFactory;
import org.junit.Test;

import static com.myers.fizzbuzz.common.Constants.*;
import static org.junit.Assert.assertEquals;

public class EnhancedFizzBuzzTest {

    Game fizzBuzz = FizzBuzzFactory.getEnhancedFizzBuzzGame();

    //Happy path tests
    @Test
    public void testCorrectAnswerFor3(){
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

    @Test
    public void testCorrectAnswerForNumberWithA5(){
        assertEquals(BUZZ, fizzBuzz.play(51));
    }

    @Test
    public void testCorrectAnswerForNumberWithA3(){
        assertEquals(FIZZ, fizzBuzz.play(13));
    }

    @Test
    public void testCorrectAnswerForNumberWith53(){
        assertEquals(FIZZBUZZ, fizzBuzz.play(53));
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
