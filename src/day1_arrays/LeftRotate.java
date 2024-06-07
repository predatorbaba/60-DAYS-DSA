package day1_arrays;

public class LeftRotate {

    public static void main(String[] args) {
        int[] input1 = {1,2,3,4,5}; // 321, 54,
        int[] input2 = {10,30,50,20,40};
        int[] input3 = {10};
        int[] input4 = {20,10};
        int[] input5 = {};

        leftRotateByOne(input1);
        leftRotateByOne(input2);
        leftRotateByOne(input3);
        leftRotateByOne(input4);
        leftRotateByOne(input5);

        leftRotateByKPlaces(input1, 2);
        leftRotateByKPlaces(input2, 2);
        leftRotateByKPlaces(input3, 4);
        leftRotateByKPlaces(input4, 5);
        leftRotateByKPlaces(input5, 2);

        // Note: You will see a little discrepancy in results because leftRotateByOne is executing first and then leftRotateByKPlaces.
        // If needed accurate results, comments any one of it and check

    }

    private static void leftRotateByOne(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Handle base cases for size 0 and 1
                Step 1: Store value of first element in temp variable
                Step 2: Put curr_ele at curr_ele - 1 position
                Step 3: Update the last element with temp
                Step 4: Print array
         */
        int size = arr.length;
        if(size == 0) return;
        if(size == 1) {
            System.out.println(arr[0]);
            return;
        }
        int targetElement = arr[0];
        for(int i=1; i<size; i++) {
            arr[i-1] = arr[i];
        }
        arr[size - 1] = targetElement;
        printArray(arr);
    }

    private static void leftRotateByKPlaces(int[] arr, int k) {
        /*
            Pseudo Code ->
                Step 0: Handle base cases for size 0, 1 and 2
                Step 1: Use reversal algorithm for making the change
                    Step 1.1: Reverse idx 0 to idx k
                    Step 1.2: Reverse idx k+1 to size - 1
                    Step 1.3: Reverse idx 0 to idx size - 1
                Note: Each reverse operation is like swapping of elements between low and high
         */
        int size = arr.length;
        if(size == 0) return;
        if(size == 1) {
            System.out.println(arr[0]);
            return;
        }
        if(size == 2) {
            reverseAlgo(arr, 0, 1);
            printArray(arr);
            return;
        }
        reverseAlgo(arr, 0, k-1);
        reverseAlgo(arr, k, size-1);
        reverseAlgo(arr, 0, size-1);
        printArray(arr);
    }

    private static void reverseAlgo(int[] arr, int leftIndex, int rightIndex) {
        while(leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }

    private static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

}
