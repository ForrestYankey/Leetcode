package com.techelevator.hackerrank;

import java.util.Scanner;

public class InputReader {
    private final Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public int readInt() {
        return scanner.nextInt();
    }
}
