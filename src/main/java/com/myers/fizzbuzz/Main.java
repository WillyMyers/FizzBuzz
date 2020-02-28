package com.myers.fizzbuzz;

import com.myers.fizzbuzz.factory.FizzBuzzFactory;
import com.myers.fizzbuzz.game.Game;

public class Main {

    public static void main(String[] args) {
        Game game = FizzBuzzFactory.getFizzBuzzGame();
        System.out.println("Standard FizzBuzz Game...");
        for(int i = 1; i<=100; i++){
            System.out.println(game.play(i));
        }

        game = FizzBuzzFactory.getEnhancedFizzBuzzGame();
        System.out.println("Enhanced FizzBuzz Game...");
        for(int i = 1; i<=100; i++){
            System.out.println(game.play(i));
        }
    }
}
