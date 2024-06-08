package day2_arrays;

public class StrongestNeighbor {

    public static void main(String[] args) {
        int[] input1 = {1,2,2,3,4,5};
        int[] input2 = {5,5};
        int[] input3 = {89,89,60};
        int[] input4 = {9,51,79,47,71,21,17,7,28,75};

        strongestNeighbor(input1);
        strongestNeighbor(input2);
        strongestNeighbor(input3);
        strongestNeighbor(input4);
    }

    private static void strongestNeighbor(int[] arr) {
        /*
            What is strongest neighbor?
                -> Max of curr_ele and curr_ele + 1
            Pseudo Code ->
                Step 0: Handle base cases for size 0 and 1
                Step 1: Handle for size 2, Max(arr[0], arr[1])
                Step 2: Traverse the array from 0 to size-1 and compare Max(arr[i], arr[i+1]) and print
         */
        int size = arr.length;
        if(size == 0 || size == 1) return;
        if(size == 2) {
            System.out.println(Math.max(arr[0], arr[1]));
            return;
        }
        for(int i=0; i<size-1; i++) {
            System.out.print(Math.max(arr[i], arr[i+1])+" ");
        }
        System.out.println();
    }

}
