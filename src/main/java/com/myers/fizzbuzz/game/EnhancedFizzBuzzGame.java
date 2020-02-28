package com.myers.fizzbuzz.game;

import static com.myers.fizzbuzz.common.Common.hasFive;
import static com.myers.fizzbuzz.common.Common.hasThree;
import static com.myers.fizzbuzz.common.Common.hasThreeAndFive;

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
