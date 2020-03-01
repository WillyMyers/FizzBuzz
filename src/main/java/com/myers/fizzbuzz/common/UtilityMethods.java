package com.myers.fizzbuzz.common;

public class UtilityMethods {

    public static boolean hasThree(int n) {
        return numberContains(3, n);
    }

    public static boolean hasFive(int n) {
        return numberContains(5, n);
    }

    public static boolean hasThreeAndFive(int n) {
        return hasThree(n) && hasFive(n);
    }

    private static boolean numberContains(int target, int num) {
        while (num > 0) {
            if (num % 10 == target) {
                return true;
            }
            num = num / 10;
        }
        return false;
    }
}
