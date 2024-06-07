package day1_arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] input1 = {1,2,3,4,5};
        int[] input2 = {10,30,50,20,40};
        int[] input3 = {10};
        int[] input4 = {20,10};
        int[] input5 = {};

        int result1 = secondLargestElement(input1);
        int result2 = secondLargestElement(input2);
        int result3 = secondLargestElement(input3);
        int result4 = secondLargestElement(input4);
        int result5 = secondLargestElement(input5);

        System.out.println("Result 1: "+result1);
        System.out.println("Result 2: "+result2);
        System.out.println("Result 3: "+result3);
        System.out.println("Result 4: "+result4);
        System.out.println("Result 5: "+result5);
    }

    private static int secondLargestElement(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Perform basic base conditions checks where size = 0, 1 and 2
                Step 1: Create 2 variable for tracking largest and secondLargest elements
                Step 2: Traverse through the array and perform the following checks
                    Step 2.1: if (curr_ele > largest) -> update largest = curr_ele and secondLargest = largest
                    Step 2.2: else (curr_ele < largest && curr_ele > secondLargest) -> secondLargest = curr_ele
                Step 3: return the result
         */
        int size = arr.length;
        if(size == 0 || size == 1) return -1;
        if(size == 2) return Math.min(arr[0], arr[1]);
        int largestIndex = 0;
        int secondLargestIndex = 0;
        for(int i=1; i<size; i++) {
            if(arr[i] > arr[largestIndex]) {
                secondLargestIndex = largestIndex;
                largestIndex = i;
            } else if(arr[i] < arr[largestIndex] && arr[i] > arr[secondLargestIndex]) {
                secondLargestIndex = i;
            }
        }
        return arr[secondLargestIndex];
    }

}
