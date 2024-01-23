package com.techelevator.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.
 *
 * Example
 *
 *
 *
 * There are  instances of ',  of '' and  of ''. For each query, add an element to the return array, .
 *
 * Function Description
 *
 * Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in strings.
 *
 * matchingStrings has the following parameters:
 *
 * string strings[n] - an array of strings to search
 * string queries[q] - an array of query strings
 * Returns
 *
 * int[q]: an array of results for each query
 * Input Format
 *
 * The first line contains and integer , the size of .
 * Each of the next  lines contains a string .
 * The next line contains , the size of .
 * Each of the next  lines contains a string .
 *
 * Constraints
 *
 *
 *
 *  .
 */
public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> finalList = new ArrayList<>();
        System.out.println("strings:" + strings);
        System.out.println("queries:" + queries);
        int counter = 0;
        for (int i = 0; i < queries.size(); i++){
            String query = queries.get(i);
            for (int j = 0; j < strings.size(); j++){
                if (query.equals(strings.get(j))){
                    counter++;
                }
            }
            finalList.add(counter);
            counter = 0;
        }

        return finalList;
    }
}

