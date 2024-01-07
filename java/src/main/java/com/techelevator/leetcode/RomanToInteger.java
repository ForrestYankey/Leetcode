package com.techelevator.leetcode;

public class RomanToInteger {

    /**
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     *
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     *
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     *
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     */

    public int romanToInt(String s) {
        int romanToInt = 0;
        int length = s.length();
        if (length == 0) {
            return 0;
        }

        for (int i = 0; i < length; i++) {
            char currentValue = s.charAt(i);
            char valueBefore = '_';

            if (i > 0) {
                valueBefore = s.charAt(i - 1);
            }

            if (currentValue == 'V' && valueBefore == 'I') {
                romanToInt -= 1;
                romanToInt += 4;
            } else if (currentValue == 'I') {
                romanToInt += 1;
            } else if (currentValue == 'V') {
                romanToInt += 5;
            } else if (currentValue == 'X' && valueBefore == 'I') {
                romanToInt -= 1;
                romanToInt += 9;
            } else if (currentValue == 'X' && valueBefore == 'X') {
                romanToInt -= 10;
                romanToInt += 20;
            } else if (currentValue == 'X') {
                romanToInt += 10;
            } else if (currentValue == 'L' && valueBefore == 'X') {
                romanToInt -= 10;
                romanToInt += 40;
            } else if (currentValue == 'L') {
                romanToInt += 50;
            } else if (currentValue == 'C'  && valueBefore == 'X') {
                romanToInt -= 10;
                romanToInt += 90;
            } else if (currentValue == 'C') {
                romanToInt += 100;
            } else if (currentValue == 'D' && valueBefore == 'C') {
                romanToInt -= 100;
                romanToInt += 400;
            } else if (currentValue == 'D') {
                romanToInt += 500;
            } else if (currentValue == 'M' && valueBefore == 'C') {
                romanToInt -= 100;
                romanToInt += 900;
            } else if (currentValue == 'M') {
                romanToInt += 1000;
            }
        }
        return romanToInt;
    }
}
