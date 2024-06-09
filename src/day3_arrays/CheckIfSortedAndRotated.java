package day3_arrays;

public class CheckIfSortedAndRotated {

    public static void main(String[] args) {
        int[] input1 = {3,4,1,2};
        int[] input2 = {1,2,3};

        boolean result1 = checkIfArrayIsSortedAndRotated(input1);
        boolean result2 = checkIfArrayIsSortedAndRotated(input2);

        System.out.println(result1);
        System.out.println(result2);
    }

    private static boolean checkIfArrayIsSortedAndRotated(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Handle base cases for size 0, 1 and 2
                Step 1: Traverse the array and check for following:
                    Step 1.1: Elements in increasing order, that means isSorted -> true
                    Step 1.2: First occurrence of curr_ele > curr_ele + 1, make isRotated -> true
                    Step 1.3: If isRotated is true, and any other occurrence of curr_ele > curr_ele + 1 comes, return false
         */
        int size = arr.length;
        if(size == 0) return false;
        if(size == 1) return true;
        if(size == 2) return arr[1] > arr[0];
        boolean isSorted = false;
        boolean isRotated = false;
        for(int i=0; i<size-1; i++) {
            if(arr[i] < arr[i+1]) {
                isSorted = true;
            } else if(arr[i] > arr[i+1] && !isRotated) {
                isRotated = true;
            } else if(arr[i] > arr[i+1] && isRotated) {
                return false;
            }
        }
        return isSorted && isRotated;
    }

}
