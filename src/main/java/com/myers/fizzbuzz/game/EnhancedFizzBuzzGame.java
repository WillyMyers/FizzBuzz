package com.myers.fizzbuzz.game;

import java.util.Optional;
import java.util.function.Function;

public class EnhancedFizzBuzzGame extends FizzBuzzGame {

    @Override
    protected Function<Integer, Optional<String>> getPlainNumberFunction(){
        return (Integer x) -> Optional.ofNullable(String.valueOf(x));
    }

    @Override
    protected Function<Integer, Optional<String>> getFizzBuzzFunction(){
        return (Integer x) -> (x > 0 && x % 15 == 0) || hasThreeAndFive(x)? Optional.of("FizzBuzz"):Optional.empty();
    }

    @Override
    protected Function<Integer, Optional<String>> getFizzFunction(){
        return (Integer x) -> (x > 0 && x % 3 == 0) || hasThree(x) ? Optional.of("Fizz"):Optional.empty();
    }

    @Override
    protected Function<Integer, Optional<String>> getBuzzFunction(){
        return (Integer x) -> (x > 0 && x % 5 == 0) || hasFive(x)? Optional.of("Buzz"):Optional.empty();
    }

    public boolean hasThree(int n) {
        while(n > 0) {
            if(n % 10 == 3)
                return true;
            n=n/10;
        }
        return false;
    }

    public boolean hasFive(int n) {
        while(n > 0) {
            if(n % 10 == 5)
                return true;
            n=n/10;
        }
        return false;
    }

    public boolean hasThreeAndFive(int n){
        return hasThree(n) && hasFive(n);
    }
}
