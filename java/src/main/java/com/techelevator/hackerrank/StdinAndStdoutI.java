package com.techelevator.hackerrank;

import java.util.Scanner;

/**
 * In this challenge, you must read  integers from stdin and then print them to stdout.
 * Each integer must be printed on a new line. To make the problem a little easier,
 * a portion of the code is provided for you in the editor below.
 */
public class StdinAndStdoutI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        InputReader inputReader = new InputReader(scan);
        int a = inputReader.readInt();
        // Complete this line
        int b = inputReader.readInt();
        // Complete this line
        int c = inputReader.readInt();

        System.out.println(a + "\n" + b + "\n" + c);
    }
}
