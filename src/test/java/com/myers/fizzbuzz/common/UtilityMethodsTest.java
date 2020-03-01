package com.myers.fizzbuzz.common;

import org.junit.Test;

import static com.myers.fizzbuzz.common.UtilityMethods.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UtilityMethodsTest {

    @Test
    public void testHasThreeReturnsTrueFor35() {
        assertTrue(hasThree(35));
    }

    @Test
    public void testHasThreeReturnsFalseFor45() {
        assertFalse(hasThree(45));
    }

    @Test
    public void testHasFiveReturnsTrueFor35() {
        assertTrue(hasFive(35));
    }

    @Test
    public void testHasFiveReturnsFalseFor43() {
        assertFalse(hasFive(43));
    }

    @Test
    public void testHasThreeAndFiveReturnsTrueFor35() {
        assertTrue(hasThreeAndFive(35));
    }

    @Test
    public void testHasThreeAndFiveReturnsFalseFor43() {
        assertFalse(hasThreeAndFive(43));
    }
}
