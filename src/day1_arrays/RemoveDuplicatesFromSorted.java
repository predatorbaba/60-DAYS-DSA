package day1_arrays;

public class RemoveDuplicatesFromSorted {

    public static void main(String[] args) {
        int[] input1 = {1,2,3,3,4,4,5,5};
        int[] input2 = {10,10,20,20,20,30,30,30,30,40,40,40,40,40,50,50,50,50,50};
        int[] input3 = {10,10,10,10,10};
        int[] input4 = {10,20,20};
        int[] input5 = {};
        int[] input6 = {1,2,3,4,5,6};

        removeDuplicates(input1);
        removeDuplicates(input2);
        removeDuplicates(input3);
        removeDuplicates(input4);
        removeDuplicates(input5);
        removeDuplicates(input6);
    }

    private static void removeDuplicates(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Take care of base conditions where array is empty
                Step 1: Initialize another array with same size for storing results, and index variable for keeping tracking of result array index
                Step 2: Traverse the array and check (curr_ele != curr_ele + 1) -> add in result array
                Step 3: As above condition is missing last element, we can add it manually
                Step 4: Print array
         */
        int size = arr.length;
        if(size == 0) return;
        int[] resultArr = new int[size];
        int resultArrIndex = 0;
        for(int i=0; i<size-1; i++) {
            if(arr[i] != arr[i+1]) {
                resultArr[resultArrIndex] = arr[i];
                resultArrIndex++;
            }
        }
        resultArr[resultArrIndex] = arr[size - 1];
        printArray(resultArr);
    }

    private static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

}
