package day2_arrays;

import java.util.Arrays;

public class MeanAndMedian {

    public static void main(String[] args) {
        int[] input1 = {1, 2, 19, 28, 5};
        int[] input2 = {2, 8, 3, 4};

        int meanResult1 = mean(input1);
        int meanResult2 = mean(input2);
        int medianResult1 = median(input1);
        int medianResult2 = median(input2);

        System.out.println("Mean is: "+meanResult1+" Median is: "+medianResult1);
        System.out.println("Mean is: "+meanResult2+" Median is: "+medianResult2);
    }

    private static int median(int[] arr) {
        /*
            What is median?
                -> The middle element after sorting the array
            Pseudo Code ->
                Step 0: Handle base cases for 0 and 1
                Step 1: Sort the Array
                Step 2: Find the middle and return
         */
        int size = arr.length;
        if(size == 0) return -1;
        if(size == 1) return arr[0];
        if(size == 2) return arr[1];
        Arrays.sort(arr);
        if(size % 2 == 0) {
            int medianIndex = (size/2) - 1;
            return arr[medianIndex];
        }
        int medianIndex = (size/2);
        return arr[medianIndex];
    }

    private static int mean(int[] arr) {
        /*
            What is mean?
                -> Sum of all numbers/size of array
            Pseudo Code ->
                Step 0: Handle base cases for 0 and 1
                Step 1: Calculate sum of all elements in array
                Step 2: Calculate mean by dividing the sum with size of array and return
         */
        int size = arr.length;
        if(size == 0) return -1;
        if(size == 1) return arr[0];
        int totalSum = 0;
        for(int i=0; i<size; i++) {
            totalSum += arr[i];
        }
        int mean = totalSum/size;
        return mean;
    }

}
