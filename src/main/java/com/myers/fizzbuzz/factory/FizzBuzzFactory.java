package com.myers.fizzbuzz.factory;

import com.myers.fizzbuzz.game.FizzBuzzGame;
import com.myers.fizzbuzz.game.Game;

public class FizzBuzzFactory {

    public static Game getFizzBuzzGame(){
        return new FizzBuzzGame();
    }
}
