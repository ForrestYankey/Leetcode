package com.techelevator.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class StdinAndStdoutITest {

    @Test
    public void testStdinAndStdoutI_ReadsSingleInput() {
        // Arrange
        String input = "42\n100\n125\n"; // Simulating input "42", "100", "125"
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        StdinAndStdoutI.main(new String[0]);

        // Assert
        String expectedOutput = "42\n100\n125\n"; // Adjusted to include newline characters
        assertEquals(expectedOutput, outputStream.toString(), "Output lines do not match the expected lines");
    }
}