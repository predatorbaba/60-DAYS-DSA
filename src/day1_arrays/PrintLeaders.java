package day1_arrays;

import java.sql.Array;
import java.util.ArrayList;

public class PrintLeaders {

    public static void main(String[] args) {
        int[] input1 = {7,10,4,3,6,5,2};
        int[] input2 = {};
        int[] input3 = {10,20,30};
        int[] input4 = {30,20,10};
        int[] input5 = {16,17,4,3,5,2};

        ArrayList<Integer> result1 = printLeaders(input1);
        ArrayList<Integer> result2 = printLeaders(input2);
        ArrayList<Integer> result3 = printLeaders(input3);
        ArrayList<Integer> result4 = printLeaders(input4);
        ArrayList<Integer> result5 = printLeaders(input5);

        for(Integer i: result1) {
            System.out.print(i+",");
        }
        for(Integer i: result2) {
            System.out.print(i+",");
        }
        for(Integer i: result3) {
            System.out.print(i+",");
        }
        for(Integer i: result4) {
            System.out.print(i+",");
        }
        for(Integer i: result5) {
            System.out.print(i+",");
        }

    }

    private static ArrayList<Integer> printLeaders(int[] arr) {
        /*
            What is leader: If there is no greater element on the right side of curr_ele, and rightmost element is always leader
            Pseudo Code ->
                Step 0: Handle base cases for size 0, and 1
                Step 1: As we know rightmost is always leader, so, we will start traversal from right
                    Step 1.1: Store last element in a variable
                    Step 1.2: Check (curr_leader < curr_ele) -> update curr_leader and print
         */
        ArrayList<Integer> result = new ArrayList<>();
        int size = arr.length;
        if(size == 0) return result;
        if(size == 1) {
            result.add(arr[0]);
            return result;
        }
        int curr_leader = arr[size-1];
        result.add(curr_leader);
        for(int i=size-1; i>=0; i--) {
            if (curr_leader < arr[i]) {
                curr_leader = arr[i];
                result.add(curr_leader);
            }
        }
        reverse(result);
        return result;
    }

    private static void reverse(ArrayList<Integer> arr) {
        int left = 0;
        int right = arr.size() - 1;
        while(left <= right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;
        }
    }

}
