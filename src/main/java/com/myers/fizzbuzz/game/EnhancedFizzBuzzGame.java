package com.myers.fizzbuzz.game;

import static com.myers.fizzbuzz.common.UtilityMethods.*;

/**
 * A modified version of the game that returns based on the presence of 3, 5, or
 * both in the number passed in
 */
public class EnhancedFizzBuzzGame extends FizzBuzzGame {

    @Override
    protected boolean isBuzz(Integer x) {
        return super.isBuzz(x) || hasFive(x);
    }

    @Override
    protected boolean isFizzBuzz(Integer x) {
        return super.isFizzBuzz(x) || hasThreeAndFive(x);
    }

    @Override
    protected boolean isFizz(Integer x) {
        return super.isFizz(x) || hasThree(x);
    }

}
