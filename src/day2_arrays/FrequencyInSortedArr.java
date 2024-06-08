package day2_arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyInSortedArr {

    public static void main(String[] args) {
        int[] input1 = {10,10,10,25,30,30};
        int[] input2 = {10,10,10,10};
        int[] input3 = {10,20,30,40};
        int[] input4 = {10,20,30,40,50,50,50,50};

        HashMap<Integer, Integer> result1 = findFrequency(input1);
        HashMap<Integer, Integer> result2 = findFrequency(input2);
        HashMap<Integer, Integer> result3 = findFrequency(input3);
        HashMap<Integer, Integer> result4 = findFrequency(input4);

        for(Map.Entry<Integer, Integer> element: result1.entrySet()) {
            Integer key = element.getKey();
            Integer value = element.getValue();
            System.out.println(key+"->"+value);
        }
        System.out.println();
        for(Map.Entry<Integer, Integer> element: result2.entrySet()) {
            Integer key = element.getKey();
            Integer value = element.getValue();
            System.out.println(key+"->"+value);
        }
        System.out.println();
        for(Map.Entry<Integer, Integer> element: result3.entrySet()) {
            Integer key = element.getKey();
            Integer value = element.getValue();
            System.out.println(key+"->"+value);
        }
        System.out.println();
        for(Map.Entry<Integer, Integer> element: result4.entrySet()) {
            Integer key = element.getKey();
            Integer value = element.getValue();
            System.out.println(key+"->"+value);
        }
    }

    private static HashMap<Integer, Integer> findFrequency(int[] arr) {
        /*
            Pseudo Code ->
                Step 0: Handle base cases for 0 and 1
                Step 1: Traverse the array and perform the following operations
                    Step 1.0: For every unique element, create entry in HashMap, and increment count
                    Step 1.1: Until same element, increase value of count
                    Step 1.2: Once another element comes which is not present in HashMap, create new entry, reset count value and perform Step 1.1
         */
        HashMap<Integer, Integer> result = new HashMap<>();
        int size = arr.length;
        if(size == 0) return result;
        if(size == 1) {
            result.put(arr[0], 1);
            return result;
        }
        for(int i=0; i<size; i++) {
            if(result.isEmpty() || !result.containsKey(arr[i])) {
                result.put(arr[i], 1);
            } else {
                result.compute(arr[i], (k, currentVal) -> currentVal + 1);
            }
        }
        return result;
    }

}
