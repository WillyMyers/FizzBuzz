package com.myers.fizzbuzz.game;

import com.myers.fizzbuzz.handler.Handler;

import java.util.Optional;
import java.util.function.Function;

import static com.myers.fizzbuzz.common.Constants.*;

/**
 * The classic version of FizzBuzz
 */
public class FizzBuzzGame implements Game {

    private Handler fizzBuzzHandler;

    public FizzBuzzGame() {
        Handler plain = new Handler(null, getPlainNumberFunction());
        Handler fizz = new Handler(plain, getFizzFunction());
        Handler buzz = new Handler(fizz, getBuzzFunction());
        Handler fizzBuzz = new Handler(buzz, getFizzBuzzFunction());
        fizzBuzzHandler = new Handler(fizzBuzz, getValidNumberFunction());
    }

    @Override
    public String play(int number) {
        return fizzBuzzHandler.handle(number);
    }

    private Function<Integer, Optional<String>> getPlainNumberFunction(){
        return (Integer x) -> Optional.ofNullable(String.valueOf(x));
    }

    private Function<Integer, Optional<String>> getFizzBuzzFunction(){
        return (Integer x) -> Optional.ofNullable(isFizzBuzz(x) ? FIZZBUZZ : null);
    }

    private Function<Integer, Optional<String>> getFizzFunction(){
        return (Integer x) -> Optional.ofNullable(isFizz(x) ? FIZZ : null);
    }

    private Function<Integer, Optional<String>> getBuzzFunction(){
        return (Integer x) -> Optional.ofNullable(isBuzz(x) ? BUZZ : null);
    }

    private Function<Integer, Optional<String>> getValidNumberFunction(){
        //might want to change this to throw an exception if an invalid number is passed
        return (Integer x) -> Optional.ofNullable(isValidNumber(x) ? null : String.valueOf(x));
    }

    protected boolean isValidNumber(Integer x) {
        return x > 0;
    }

    protected boolean isBuzz(Integer x) {
        return x % 5 == 0;
    }

    protected boolean isFizzBuzz(Integer x) {
        return x % 15 == 0;
    }

    protected boolean isFizz(Integer x) {
        return x % 3 == 0;
    }

}
