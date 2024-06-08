package day2_arrays;

public class RotateByDPlaces {

    public static void main(String[] args) {
        int[] input1 = {1,2,3,4,5};
        int[] input2 = {2,4,6,8,10,12,14,16,18,20};
        int[] input3 = {25,6,20,55,69,5,50,63,61,41,87,80,2,96,77,70,12,43,31,8,64,41,68,18,95,79,52,74,1,98,3,26,3,74,32,23,79,81,37,39,21,24,18,22,71,47,44};

        rotateArrayByDPlaces(input1, 2);
        rotateArrayByDPlaces(input2, 3);
        rotateArrayByDPlaces(input3, 77);
    }

    private static void rotateArrayByDPlaces(int[] arr, int d) {
        /*
            Pseudo Code ->
                Step 0: Handle base cases for 0 and 1
                Step 1: If d => size, adjust value of d
                Step 1: Traverse the array from 0 to d and store elements in temp arr
                Step 2: Traverse array from d to size, and replace elements from beginning
                Step 3: Copy temp array elements in primary array
                Step 4: Print elements
         */
        int size = arr.length;
        if(size == 0) return;
        if(size == 1) {
            printArray(arr);
            return;
        }
        d = d % size;
        if(d == 0) {
            printArray(arr);
            return;
        }
        int[] tempArr = new int[d+1];
        for(int i=0; i<d; i++) {
            tempArr[i] = arr[i];
        }
        int index = 0;
        for(int i=d; i<size; i++) {
            arr[index] = arr[i];
            index++;
        }
        for(int i=0,j=size-d; i<tempArr.length && j<size; i++,j++) {
            arr[j] = tempArr[i];
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
