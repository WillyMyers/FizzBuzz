package com.myers.fizzbuzz;

import com.myers.fizzbuzz.factory.FizzBuzzFactory;
import com.myers.fizzbuzz.game.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        System.out.println("Please choose the game to play, 1 for standard, 2 for enhanced...\ninput:");
        String flavour = stdin.nextLine();

        Game game = flavour.equals("1")? FizzBuzzFactory.getFizzBuzzGame(): FizzBuzzFactory.getEnhancedFizzBuzzGame();
        for(int i = 1; i<=100; i++){
            System.out.println(game.play(i));
        }
    }
}
