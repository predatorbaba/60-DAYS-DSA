package day1_arrays;

public class IsSorted {

    public static void main(String[] args) {
        int[] input1 = {1,2,3,4,5};
        int[] input2 = {1,2,4,3,5};
        int[] input3 = {};
        int[] input4 = {1,1,2,3};

        boolean result1 = isSorted(input1);
        boolean result2 = isSorted(input2);
        boolean result3 = isSorted(input3);
        boolean result4 = isSorted(input4);

        System.out.println("Result 1: "+result1);
        System.out.println("Result 2: "+result2);
        System.out.println("Result 3: "+result3);
        System.out.println("Result 4: "+result4);
    }

    private static boolean isSorted(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Handle base cases where size is 0, 1 and 2
                Step 1: Traverse the array and compare if (curr_ele > curr_ele + 1) -> return false
         */
        int size = arr.length;
        if(size == 0) return false;
        if(size == 1) return true;
        if(size == 2) return arr[0] > arr[1] ? false : true;
        for(int i=0; i<size-1; i++) {
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }

}
