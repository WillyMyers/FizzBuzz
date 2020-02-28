package com.myers.fizzbuzz.game;

public class EnhancedFizzBuzzGame extends FizzBuzzGame {

    protected boolean isBuzz(Integer x) {
        return super.isBuzz(x) || hasFive(x);
    }

    protected boolean isFizzBuzz(Integer x) {
        return super.isFizzBuzz(x) || hasThreeAndFive(x);
    }

    protected boolean isFizz(Integer x) {
        return super.isFizz(x) || hasThree(x);
    }

    private boolean hasThree(int n) {
        while(n > 0) {
            if(n % 10 == 3)
                return true;
            n=n/10;
        }
        return false;
    }

    private boolean hasFive(int n) {
        while(n > 0) {
            if(n % 10 == 5)
                return true;
            n=n/10;
        }
        return false;
    }

    private boolean hasThreeAndFive(int n){
        return hasThree(n) && hasFive(n);
    }
}
