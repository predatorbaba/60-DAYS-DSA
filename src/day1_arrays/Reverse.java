package day1_arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] input1 = {1,2,3,4,5};
        int[] input2 = {10,30,50,20,40};
        int[] input3 = {10};
        int[] input4 = {10,20};
        int[] input5 = {};
        int[] input6 = {1,2,3,4,6,5};

        reverseArray(input1);
        reverseArray(input2);
        reverseArray(input3);
        reverseArray(input4);
        reverseArray(input5);
        reverseArray(input6);
    }

    private static void reverseArray(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Initialize 2 variable, left and right
                Step 1: Perform a loop until left <= right
                Step 2: Swap left and right elements and update left and right
                Step 3: Print array
         */
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while(leftIndex <= rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

}
