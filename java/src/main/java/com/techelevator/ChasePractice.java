package com.techelevator;

import org.springframework.data.relational.core.sql.In;

import java.util.ArrayList;
import java.util.List;

public class ChasePractice {

    public static void main(String[] args) {
        List<Integer> numsList = new ArrayList<>();
        numsList.add(1);
        numsList.add(1);
        numsList.add(2);
        numsList.add(2);
        numsList.add(3);
        numsList.add(3);
        List<Integer> numsList2 = new ArrayList<>();
        numsList2.add(11);
        numsList2.add(11);
        numsList2.add(24);
        numsList2.add(201);
        numsList2.add(0);
        numsList2.add(13);
        System.out.println(findSumOfOddNums(numsList2)); //8
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
}
