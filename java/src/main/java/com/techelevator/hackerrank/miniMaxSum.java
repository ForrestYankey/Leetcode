package com.techelevator.hackerrank;

public class miniMaxSum {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        //ceate an array to store values
        long values[] = new long[5];

        //loop through arr
        for (int i = 0; i < arr.size(); i++) {
            long current = 0;
            for (int j = 0; j < arr.size(); j++){
                if (i != j){
                    current += arr.get(j);
                }
            }
            //add current to array
            values[i] = current;
        }

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        //find max and min
        for (long value : values) {
            min = Math.min(min, value);
            max = Math.max(max, value);
        }

        System.out.println(min + " " + max);
    }
}
