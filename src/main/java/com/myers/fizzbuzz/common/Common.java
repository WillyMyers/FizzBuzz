package com.myers.fizzbuzz.common;

public class Common {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = "FizzBuzz";

    public static boolean hasThree(int n) {
        while(n > 0) {
            if(n % 10 == 3) {
                return true;
            }
            n=n/10;
        }
        return false;
    }

    public static boolean hasFive(int n) {
        while(n > 0) {
            if(n % 10 == 5) {
                return true;
            }
            n=n/10;
        }
        return false;
    }

    public static boolean hasThreeAndFive(int n){
        return Common.hasThree(n) && Common.hasFive(n);
    }
}
