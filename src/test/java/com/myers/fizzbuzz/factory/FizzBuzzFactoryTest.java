package com.myers.fizzbuzz.factory;

import com.myers.fizzbuzz.game.EnhancedFizzBuzzGame;
import com.myers.fizzbuzz.game.FizzBuzzGame;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FizzBuzzFactoryTest {

    @Test
    public void testStandardFizzBuzzIsReturned() {
        assertTrue(FizzBuzzFactory.getFizzBuzzGame() instanceof FizzBuzzGame);
    }

    @Test
    public void testEnhancedFizzBuzzIsReturned() {
        assertTrue(FizzBuzzFactory.getEnhancedFizzBuzzGame() instanceof EnhancedFizzBuzzGame);
    }
}
