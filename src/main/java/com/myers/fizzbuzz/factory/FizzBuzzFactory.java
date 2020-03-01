package com.myers.fizzbuzz.factory;

import com.myers.fizzbuzz.game.EnhancedFizzBuzzGame;
import com.myers.fizzbuzz.game.FizzBuzzGame;
import com.myers.fizzbuzz.game.Game;

/**
 * Factory to return the correct flavour of the game
 */
public class FizzBuzzFactory {

    public static Game getFizzBuzzGame(){
        return new FizzBuzzGame();
    }

    public static Game getEnhancedFizzBuzzGame(){
        return new EnhancedFizzBuzzGame();
    }
}
