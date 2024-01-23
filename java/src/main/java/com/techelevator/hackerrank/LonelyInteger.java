package com.techelevator.hackerrank;

import java.util.List;

/**
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 *
 * Example
 *
 * The unique element is .
 *
 * Function Description
 *
 * Complete the lonelyinteger function in the editor below.
 *
 * lonelyinteger has the following parameter(s):
 *
 * int a[n]: an array of integers
 * Returns
 *
 * int: the element that occurs only once
 */
public class LonelyInteger {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int size = a.size();
        int uniqueElement = 0;

        for (int i = 0; i < size; i++) {
            Integer current = a.get(i);
            boolean isUnique = true;
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    if (current != a.get(j)) {
                        isUnique = true;
                    } else {
                        isUnique = false;
                        break;
                    }
                }

            }
            if (isUnique) {
                uniqueElement = current;
                break;
            }
        }
        return uniqueElement;
    }
}
