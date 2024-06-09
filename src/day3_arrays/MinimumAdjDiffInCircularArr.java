package day3_arrays;

import java.util.Arrays;

public class MinimumAdjDiffInCircularArr {

    public static void main(String[] args) {
        int[] input1 = {8,-8,9,-9,10,-11,12};
        int[] input2 = {10,-3,-4,7,6,5,-4,-1};

        int result1 = findMinAdjDifferenceInCircularArr(input1);
        int result2 = findMinAdjDifferenceInCircularArr(input2);

        System.out.println(result1);
        System.out.println(result2);
    }

    private static int findMinAdjDifferenceInCircularArr(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Handle base cases for size 0 and 1
                Step 1: Initialise a result array for storing all differences, and traverse the array from 1 to size
                    Step 1.1: calculate difference arr[i-1] - arr[i], and make it absolute
                    Step 1.2: Check once i == size, calculate difference arr[size] - arr[0], and store in array
                    Step 1.3: Sort the array and return arr[0]
         */
        int size = arr.length;
        if(size == 0) return -1;
        if(size == 1) return arr[0];
        int minDiff = Integer.MAX_VALUE;
        for(int i=1; i<size; i++) {
            int diff = Math.abs(arr[i-1] - arr[i]);
            if(minDiff > diff) {
                minDiff = diff;
            }
        }
        int diff = Math.abs(arr[size-1] - arr[0]);
        if(minDiff > diff) minDiff = diff;
        return minDiff;
    }

}
