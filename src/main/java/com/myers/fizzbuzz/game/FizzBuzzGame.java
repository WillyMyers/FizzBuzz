package com.myers.fizzbuzz.game;

import com.myers.fizzbuzz.handler.Handler;

import java.util.Optional;
import java.util.function.Function;

public class FizzBuzzGame implements Game {

    private Handler fizzBuzzHandler;

    public FizzBuzzGame() {
        Handler plain = new Handler(null, getPlainNumberFunction());
        Handler fizz = new Handler(plain, getFizzFunction());
        Handler buzz = new Handler(fizz, getBuzzFunction());
        fizzBuzzHandler = new Handler(buzz, getFizzBuzzFunction());
    }

    @Override
    public String play(int number) {
        return fizzBuzzHandler.handle(number);
    }

    private Function<Integer, Optional<String>> getPlainNumberFunction(){
        return (Integer x) -> Optional.ofNullable(String.valueOf(x));
    }

    private Function<Integer, Optional<String>> getFizzBuzzFunction(){
        return (Integer x) -> x > 0 && x % 15 == 0? Optional.of("FizzBuzz"):Optional.empty();
    }

    private Function<Integer, Optional<String>> getFizzFunction(){
        return (Integer x) -> x > 0 && x % 3 == 0? Optional.of("Fizz"):Optional.empty();
    }

    private Function<Integer, Optional<String>> getBuzzFunction(){
        return (Integer x) -> x > 0 && x % 5 == 0? Optional.of("Buzz"):Optional.empty();
    }
}
