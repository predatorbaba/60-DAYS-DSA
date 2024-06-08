package day2_arrays;

public class MaximumDifference {

    public static void main(String[] args) {
        int[] input1 = {2,3,10,6,4,1};
        int[] input2 = {7,9,5,6,3,2};
        int[] input3 = {10,20,30};
        int[] input4 = {30,10,8,2};

        int result1 = findMaxDifference(input1);
        int result2 = findMaxDifference(input2);
        int result3 = findMaxDifference(input3);
        int result4 = findMaxDifference(input4);

        int result5 = findMaxDiffEfficient(input1);
        int result6 = findMaxDiffEfficient(input2);
        int result7 = findMaxDiffEfficient(input3);
        int result8 = findMaxDiffEfficient(input4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
    }

    private static int findMaxDiffEfficient(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Handle bases cases for size 0, 1 and 2
                Step 1: Initialize 2 variables for storing maxDiff and minValue, with maxDiff -> arr[1] - arr[0] and minValue -> arr[0]
                Step 2: Traverse through array for getting the maxDiff
         */
        int size = arr.length;
        if(size == 0) return -1;
        int minValue = arr[0];
        if(size == 1) return minValue;
        int maxDiff = arr[1] - arr[0];
        if(size == 2) return maxDiff;
        for(int j=1; j<size; j++) {
            maxDiff = Math.max(maxDiff, arr[j]-minValue);
            minValue = Math.min(arr[j], minValue);
        }
        return maxDiff;
    }

    private static int findMaxDifference(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Handle base cases for size 0 and 1
                Step 1: Handle case for size 2
                Step 2: Initialize a variable for store max difference, and also traverse through array for calculate max difference
         */
        int size = arr.length;
        if(size == 0) return -1;
        if(size == 1) return arr[0];
        if(size == 2) return arr[1] - arr[0];
        int maxDiff = Integer.MIN_VALUE;
        for(int i=0; i<size-1; i++) {
            for(int j=i+1; j<size; j++) {
                int diff = arr[j] - arr[i];
                if(diff > maxDiff && j > i) {
                    maxDiff = diff;
                }
            }
        }
        return maxDiff;
    }

}
