package day3_arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfLimitedRangeElements {

    public static void main(String[] args) {
        int[] input1 = {2, 3, 2, 3, 5};
        int[] input2 = {3,3,3,3};
        int[] input3 = {8,9};
        int[] input4 = {1};

        frequencyOfLimitedRangeElements(input1);
        frequencyOfLimitedRangeElements(input2);
        frequencyOfLimitedRangeElements(input3);
        frequencyOfLimitedRangeElements(input4);
    }

    private static void frequencyOfLimitedRangeElements(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Handle base conditions for 0 and 1
                Step 1: Create a hashmap and populate with keys from 0 to size of array, with all count to 0
                Step 2: Traverse the array, and check if key exists, if exists, increase the count by 1, else continue
         */
        int size = arr.length;
        if(size == 0) return;
        if(size == 1) {
            if(arr[0] == 1) {
                System.out.println(1);
                return;
            } else {
                System.out.println(0);
                return;
            }
        }
        HashMap<Integer, Integer> result = new HashMap<>();
        for(int i=1; i<=size; i++) {
            result.put(i, 0);
        }
        for(int i=0; i<size; i++) {
            if (result.containsKey(arr[i])) {
                result.compute(arr[i], (k, currentVal) -> currentVal + 1);
            }
        }
        for(Map.Entry<Integer, Integer> ele: result.entrySet()) {
            System.out.print(ele.getValue()+" ");
        }
        System.out.println();
    }

}
