package com.myers.fizzbuzz;

import com.myers.fizzbuzz.factory.FizzBuzzFactory;
import com.myers.fizzbuzz.game.Game;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametizedEnhancedFizzBuzzTest {

    private int input;
    private String expected;
    private Game fizzBuzz = FizzBuzzFactory.getEnhancedFizzBuzzGame();

    public ParametizedEnhancedFizzBuzzTest(int input, String expected) {
        super();
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testNumbersFrom1To100(){
        assertEquals(expected, fizzBuzz.play(input));
    }

    @Parameterized.Parameters
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {2, "2"},
                {3, "Fizz"},
                {4, "4"},
                {5, "Buzz"},
                {6,"Fizz"},
                {7,"7"},
                {8,"8"},
                {9,"Fizz"},
                {10,"Buzz"},
                {11,"11"},
                {12,"Fizz"},
                {13,"Fizz"},
                {14,"14"},
                {15,"FizzBuzz"},
                {16,"16"},
                {17,"17"},
                {18,"Fizz"},
                {19,"19"},
                {20,"Buzz"},
                {21,"Fizz"},
                {22,"22"},
                {23,"Fizz"},
                {24,"Fizz"},
                {25,"Buzz"},
                {26,"26"},
                {27,"Fizz"},
                {28,"28"},
                {29,"29"},
                {30,"FizzBuzz"},
                {31,"Fizz"},
                {32,"Fizz"},
                {33,"Fizz"},
                {34,"Fizz"},
                {35,"FizzBuzz"},
                {36,"Fizz"},
                {37,"Fizz"},
                {38,"Fizz"},
                {39,"Fizz"},
                {40,"Buzz"},
                {41,"41"},
                {42,"Fizz"},
                {43,"Fizz"},
                {44,"44"},
                {45,"FizzBuzz"},
                {46,"46"},
                {47,"47"},
                {48,"Fizz"},
                {49,"49"},
                {50,"Buzz"},
                {51,"Buzz"},
                {52,"Buzz"},
                {53,"FizzBuzz"},
                {54,"Buzz"},
                {55,"Buzz"},
                {56,"Buzz"},
                {57,"Buzz"},
                {58,"Buzz"},
                {59,"Buzz"},
                {60,"FizzBuzz"},
                {61,"61"},
                {62,"62"},
                {63,"Fizz"},
                {64,"64"},
                {65,"Buzz"},
                {66,"Fizz"},
                {67,"67"},
                {68,"68"},
                {69,"Fizz"},
                {70,"Buzz"},
                {71,"71"},
                {72,"Fizz"},
                {73,"Fizz"},
                {74,"74"},
                {75,"FizzBuzz"},
                {76,"76"},
                {77,"77"},
                {78,"Fizz"},
                {79,"79"},
                {80,"Buzz"},
                {81,"Fizz"},
                {82,"82"},
                {83,"Fizz"},
                {84,"Fizz"},
                {85,"Buzz"},
                {86,"86"},
                {87,"Fizz"},
                {88,"88"},
                {89,"89"},
                {90,"FizzBuzz"},
                {91,"91"},
                {92,"92"},
                {93,"Fizz"},
                {94,"94"},
                {95,"Buzz"},
                {96,"Fizz"},
                {97,"97"},
                {98,"98"},
                {99,"Fizz"},
                {100,"Buzz"}
        });
    }
}
