package com.techelevator;

import org.springframework.data.relational.core.sql.In;

import java.util.*;

public class ChasePractice {

    public static void main(String[] args) {
    List<String> friendPairs = new ArrayList<>();
    friendPairs.add("Harry/Ron");
    friendPairs.add("Ron/Hermione");
    friendPairs.add("Harry/Hermione");
    friendPairs.add("Hermione/Lavender");

        System.out.println(cliqueOfThree(friendPairs));
    }

    /** given a list of integers, write a function that calculates the sum of all even numbers in the list */

    public static Integer findSumOfOddNums(List<Integer> numsList) {
        Integer totalSumOfOddNums = 0;

        //loop through the list
        for (int i = 0; i < numsList.size(); i++) {
            //check if the number is odd
            if (numsList.get(i) % 2 != 0) {
                //if it is, add it to totalSumOfOddNums
                totalSumOfOddNums += numsList.get(i);
            }
        }
        return totalSumOfOddNums;
    }


    /** takes a string as input and returns the reversed version of that string*/

    public static String reverseString(String string) {
        int length = string.length();
        //take each char of the string and place it into an array
        char[] stringArray = string.toCharArray();
        char[] reversedArray = new char[string.length()];
        int j = 0;
        //loop through the string array and reverse their order
        for (int i = length - 1; i >= 0; i--){

            reversedArray[j] = stringArray[i];
            j++;
        }
        String reversedString = "";
        //loop through the reversedArray and make a String
        for (char letter : reversedArray) {
            reversedString += letter;
        }
        return reversedString;
    }

    /** Create a function that counts the integer's number of digits. */

    public static int numberOfDigits(Integer number) {
        int numberOfDigits = 0;

        //make integer a string
        String numberString = String.valueOf(number);
        //make string an array
        char[] numberArray = numberString.toCharArray();
        //loop through array and increment numberOfDigits
        for (char num : numberArray) {
            numberOfDigits++;
        }

        return numberOfDigits;
    }

    /** Create a function that takes a string and returns a string ordered by the length of the words. From shortest to
     * longest word. If there are words with the same amount of letters, order them alphabetically. */

    public static String orderedString(String string) {
        String orderedString = "test";

        //turn those string into arrays
        String[] stringArray = string.split(" ");

        Map<String, Integer> stringMap = new TreeMap<>();
        //count the number of digits in each string
        for (String s : stringArray) {
            int digits = 0;
            //turn the string into a char array
            char[] chars = s.toCharArray();
            //for each char in array digits++
            for (char c : chars) {
                digits++;
            }
            //put string into map with digits as key
            //put each string into a Map where the Key is the string and the value is the number of digits **repeated words? Order alphabetically
            stringMap.put(s, digits);
        }

        //add the string from the map to ordered string based on length
        for (int i = 0; i < stringMap.size(); i++) {
            //if they are the same length order them alphabetically
        }
        return orderedString;
    }

    /** Algorithm
     For the sake of simplicity I'll refer to the first number as "a", the second number as "b", and the remainder as "r". The algorithm can be broken down into four steps:

     Ensure that "a" >= "b". If "a" < "b", swap them.
     Find the remainder. Divide "a" by "b" and set "r" as the remainder.
     Is "r" zero? If so terminate the function and return "b" (the second number).
     Set "a" = "b" and "b" = "r" and start the algorithm over again.
     Instructions
     Create a recursive function that returns the GCD between two positive numbers using the Euclidean Algorithm. */

    public static int euclideanAlgorithm(int a, int b) {
        int r = 0;
        //check that a is greater than b
        if (a < b) {
            int c = b;
            b = a;
            a = c;
        }

        while (true) {
            r = a % b;
            if (r == 0) {
                return b;
            } else {
                a = b;
                b = r;
            }
        }
    }


    /** Given a list of friend pairs, find a clique of three (a.k.a. triangle): a group of three people who are all friends with each other.
     * The order of the three names in the returned string does not matter.
     *
     * If there is no clique-of-three, return an empty string.
     *
     * The members of a clique-of-three must be three different people. In particular, a person who claims to be his own
     * friend does not constitute a clique-of-three all by himself.
     *
     * Names may contain spaces or punctuation (but not the '/' or newline characters).
     *
     * The largest test cases contain up to 750 unique names.*/

    public static String cliqueOfThree(List<String> friendPairs) {
        String clique = "";
        Map<String, List<String>> friendMap = new HashMap<>();
        //loop through the List
        for (int i = 0; i < friendPairs.size(); i++) {
            //split the friendPairs by /
            String[] pairArray = friendPairs.get(i).split("/");
            //put each pair into map with friend1 as key and friend1 and frind2
            //check if key exits
            if (friendMap.containsKey(pairArray[0])) {
                List<String> list = friendMap.get(pairArray[0]);
                list.add(pairArray[1]);
                friendMap.put(pairArray[0], list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(pairArray[0]);
                list.add(pairArray[1]);
                friendMap.put(pairArray[0], list);
            }

            if (friendMap.containsKey(pairArray[1])) {
                List<String> list = friendMap.get(pairArray[1]);
                list.add(pairArray[0]);
                friendMap.put(pairArray[1], list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(pairArray[0]);
                list.add(pairArray[1]);
                friendMap.put(pairArray[1], list);
            }



            System.out.println(friendMap);
        }
        //check for clicks
        return clique;
    }
}
