package day1_arrays;

public class LargestElement {

    public static void main(String[] args) {
        int[] input1 = {1,2,3,4,5};
        int[] input2 = {10,30,50,20,40};
        int[] input3 = {10};
        int[] input4 = {20,10};
        int[] input5 = {};

        int result1 = largestElement(input1);
        int result2 = largestElement(input2);
        int result3 = largestElement(input3);
        int result4 = largestElement(input4);
        int result5 = largestElement(input5);

        System.out.println("Result 1: "+result1);
        System.out.println("Result 2: "+result2);
        System.out.println("Result 3: "+result3);
        System.out.println("Result 4: "+result4);
        System.out.println("Result 5: "+result5);
    }

    private static int largestElement(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Check if there are only 1 or 2 elements in array, then perform one line operation
                Step 1: Initiate a variable for tracking the largest element index
                Step 2: Traverse through an array to find whether (largest < curr_ele) -> largest = curr_ele
                Step 3: Once traversal completed, return the largest element
         */
        int size =  arr.length;
        if(size == 0) return -1;
        if(size == 1) return arr[0];
        if(size == 2) return Math.max(arr[0], arr[1]);
        int largestIndex = 0;
        for(int i=1; i<size; i++) {
            if(arr[largestIndex] < arr[i]) largestIndex = i;
        }
        return arr[largestIndex];
    }

}
