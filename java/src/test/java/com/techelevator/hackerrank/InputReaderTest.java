package com.techelevator.hackerrank;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.xmlunit.builder.Input;


import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InputReaderTest {

    @Test
    public void testReadInt_SingleIntegerInput() {
        //Arrange
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextInt()).thenReturn(42);
        InputReader inputReader = new InputReader(mockScanner);

        //Act
        int result = inputReader.readInt();

        //Assert
        Assertions.assertEquals(42, result);
    }

    @Test
    public void testReadInt_MultipleInputs() {
        //Arrange
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextInt()).thenReturn(1, 2, 3);
        InputReader inputReader = new InputReader(mockScanner);

        //Act
        int[] result = new int[3];
        for (int i = 0; i < 3; i++) {
            result[i] = inputReader.readInt();
        }

        //Assert
        int[] expected = {1, 2, 3};
        Assertions.assertArrayEquals(expected, result);
    }
}