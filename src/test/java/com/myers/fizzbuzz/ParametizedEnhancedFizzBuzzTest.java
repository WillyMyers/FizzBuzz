package com.myers.fizzbuzz;

import com.myers.fizzbuzz.factory.FizzBuzzFactory;
import com.myers.fizzbuzz.game.Game;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.myers.fizzbuzz.common.Common.*;
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
                {3, FIZZ},
                {4, "4"},
                {5, BUZZ},
                {6,FIZZ},
                {7,"7"},
                {8,"8"},
                {9,FIZZ},
                {10,BUZZ},
                {11,"11"},
                {12,FIZZ},
                {13,FIZZ},
                {14,"14"},
                {15,FIZZBUZZ},
                {16,"16"},
                {17,"17"},
                {18,FIZZ},
                {19,"19"},
                {20,BUZZ},
                {21,FIZZ},
                {22,"22"},
                {23,FIZZ},
                {24,FIZZ},
                {25,BUZZ},
                {26,"26"},
                {27,FIZZ},
                {28,"28"},
                {29,"29"},
                {30,FIZZBUZZ},
                {31,FIZZ},
                {32,FIZZ},
                {33,FIZZ},
                {34,FIZZ},
                {35,FIZZBUZZ},
                {36,FIZZ},
                {37,FIZZ},
                {38,FIZZ},
                {39,FIZZ},
                {40,BUZZ},
                {41,"41"},
                {42,FIZZ},
                {43,FIZZ},
                {44,"44"},
                {45,FIZZBUZZ},
                {46,"46"},
                {47,"47"},
                {48,FIZZ},
                {49,"49"},
                {50,BUZZ},
                {51,BUZZ},
                {52,BUZZ},
                {53,FIZZBUZZ},
                {54,BUZZ},
                {55,BUZZ},
                {56,BUZZ},
                {57,BUZZ},
                {58,BUZZ},
                {59,BUZZ},
                {60,FIZZBUZZ},
                {61,"61"},
                {62,"62"},
                {63,FIZZ},
                {64,"64"},
                {65,BUZZ},
                {66,FIZZ},
                {67,"67"},
                {68,"68"},
                {69,FIZZ},
                {70,BUZZ},
                {71,"71"},
                {72,FIZZ},
                {73,FIZZ},
                {74,"74"},
                {75,FIZZBUZZ},
                {76,"76"},
                {77,"77"},
                {78,FIZZ},
                {79,"79"},
                {80,BUZZ},
                {81,FIZZ},
                {82,"82"},
                {83,FIZZ},
                {84,FIZZ},
                {85,BUZZ},
                {86,"86"},
                {87,FIZZ},
                {88,"88"},
                {89,"89"},
                {90,FIZZBUZZ},
                {91,"91"},
                {92,"92"},
                {93,FIZZ},
                {94,"94"},
                {95,BUZZ},
                {96,FIZZ},
                {97,"97"},
                {98,"98"},
                {99,FIZZ},
                {100,BUZZ}
        });
    }
}
