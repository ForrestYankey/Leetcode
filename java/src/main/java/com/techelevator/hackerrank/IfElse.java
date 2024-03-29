package com.techelevator.hackerrank;

public class IfElse {

    public String print(int number) {
        final boolean ODD = number %2 != 0;

        if (ODD ||  (number >= 6 && number <= 20)) {
            return "Weird";
        } else {
            return "Not Weird";
        }
    }
}
