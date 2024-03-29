package com.techelevator.hackerrank;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfElseTest {

    private IfElse ifElse = new IfElse();

    @Test
    @DisplayName("If number is Odd, print Weird")
    public void testIfElse_InputOddNumber_PrintsWeird() {
        String result = ifElse.print(1);
        String result2 = ifElse.print(3);

        Assertions.assertEquals("Weird", result);
        Assertions.assertEquals("Weird", result2);
    }

    @Test
    @DisplayName("If number is Even and between 2 & 5, print Not Weird")
    public void testIfElse_InputEvenNumberAndBetweenTwoAndFive_PrintsNotWeird() {
        String result = ifElse.print(2);
        String result2 = ifElse.print(4);

        Assertions.assertEquals("Not Weird", result);
        Assertions.assertEquals("Not Weird", result2);
    }

    @Test
    @DisplayName("If number is Odd and between 2 & 5, print Weird")
    public void testIfElse_InputOddNumberAndBetweenTwoAndFive_PrintsWeird() {
        String result = ifElse.print(5);

        Assertions.assertEquals("Weird", result);
    }

    @Test
    @DisplayName("If number is Even and between 6 & 20, print Weird")
    public void testIfElse_InputEvenNumberGreaterThanOrEqualToSixAndLessThanOrEqualTo20_PrintsWeird() {
        String result = ifElse.print(6);
        String result2 = ifElse.print(20);

        Assertions.assertEquals("Weird", result);
        Assertions.assertEquals("Weird", result2);
    }

    @Test
    @DisplayName("If number is Odd and between 6 & 20, print Weird")
    public void testIfElse_InputOddNumberGreaterThanOrEqualToSixAndLessThanOrEqualTo20_PrintsWeird() {
        String result = ifElse.print(7);
        String result2 = ifElse.print(19);

        Assertions.assertEquals("Weird", result);
        Assertions.assertEquals("Weird", result2);
    }

    @Test
    @DisplayName("If number is Even and greater than 20, print Not Weird")
    public void testIfElse_InputEvenNumberGreaterThan20_PrintsNotWeird() {
        String result = ifElse.print(22);

        Assertions.assertEquals("Not Weird", result);
    }

    @Test
    @DisplayName("If number is Odd and greater than 20, print Weird")
    public void testIfElse_Input0ddNumberGreaterThan20_PrintsWeird() {
        String result = ifElse.print(27);

        Assertions.assertEquals("Weird", result);
    }
}