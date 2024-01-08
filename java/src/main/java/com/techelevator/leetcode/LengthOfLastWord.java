package com.techelevator.leetcode;

public class LengthOfLastWord {

    /**
     *  Given a string s consisting of words and spaces, return the length of the last word in the string.
     *
     * A word is a maximal substring consisting of non-space characters only.
     *
     */

    public int lengthOfLastWord(String s) {
        //find the length of the string
        int length = s.length();
        int lastWord = 0;

        //loop backwards
        for ( int i = length - 1; i >= 0; i--) {
            //if the char at i != blank, decrement
            if (lastWord == 0 && s.charAt(i) == ' ') {
                continue;
            }
            else if (s.charAt(i) != ' ') {
                lastWord++;
            } else {
                break;
            }
        }
        return lastWord;
    }
}
