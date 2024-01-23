package com.techelevator.hackerrank;

public class FlippingBits {
    /**
     * You will be given a list of 32 bit unsigned integers. Flip all the bits ( and ) and return the result as an unsigned integer.
     *
     * Example
     *
     * . We're working with 32 bits, so:
     *
     *
     *
     * Return .
     *
     * Function Description
     *
     * Complete the flippingBits function in the editor below.
     *
     * flippingBits has the following parameter(s):
     *
     * int n: an integer
     * Returns
     *
     * int: the unsigned decimal integer result
     *
     */

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        // Write your code here
        String binary = String.format("%32s", Long.toBinaryString(n)).replace(' ', '0');
        StringBuilder flippedBinary = new StringBuilder();
        for (char bit : binary.toCharArray()) {
            flippedBinary.append((bit == '0') ? '1' : '0');
        }
        long decimal = Long.parseLong(flippedBinary.toString(), 2);
        return decimal;

        // return n ^ 0xFFFFFFFFL; //This will do it all in one line!!!
    }
}
