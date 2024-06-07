package day1_arrays;

public class MoveZeroesToEnd {

    public static void main(String[] args) {
        int[] input1 = {1,0,0,0,0,2,3,4};
        int[] input2 = {0,0,0,0,0};
        int[] input3 = {2,2,2,2,2,2,2};
        int[] input4 = {0,0,0,0,0,1,2,3};
        int[] input5 = {};
        int[] input6 = {1,2,3,4,0,0,0,0,0,0,4,5,6};

        moveZeroesToEnd(input1);
        moveZeroesToEnd(input2);
        moveZeroesToEnd(input3);
        moveZeroesToEnd(input4);
        moveZeroesToEnd(input5);
        moveZeroesToEnd(input6);
    }

    private static void moveZeroesToEnd(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Handle base conditions where size 0 and 1
                    Step 0.1: if size = 0 -> return
                    Step 0.2: if size = 1 -> print and return
                Step 1: Initialize another array for storing results and also one variable for tracking index
                Step 2: Traverse array, if element is non-zero, add in result array
                Step 3: Print result array
         */
        int size = arr.length;
        if(size == 0) return;
        if(size == 1) {
            System.out.println(arr[0]);
            return;
        }
        int[] resultArr = new int[size];
        int resultArrIndex = 0;
        for(int i=0; i<size; i++) {
            if(arr[i] != 0) {
                resultArr[resultArrIndex] = arr[i];
                resultArrIndex++;
            }
        }
        printArray(resultArr);
    }

    private static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

}
