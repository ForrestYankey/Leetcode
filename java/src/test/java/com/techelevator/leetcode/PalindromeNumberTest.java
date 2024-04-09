package com.techelevator.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    private PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void testIsPalindrome_ifGivenNumberIsNotAPalindrome_ReturnFalse() {
        int num = 12;

        boolean result = palindromeNumber.isPalindrome(num);

        assertFalse(result);
    }

    @Test
    public void testIsPalindrome_ifGivenPalindrome_ReturnTrue(){
        int num = 121;

        boolean result = palindromeNumber.isPalindrome(num);

        assertTrue(result);
    }

    @Test
    public void testIsPalindrome_ifGivenNegativePalindrome_ReturnFalse(){
        int num = -121;

        boolean result = palindromeNumber.isPalindrome(num);

        assertFalse(result);
    }

}