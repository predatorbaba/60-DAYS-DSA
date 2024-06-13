package day7_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveConsecutiveDuplicates {

    public static void main(String[] args) {
        String input1 = "aaaabbbbcccaaabbc";
        String input2 = "abcabcbbcc";
        String input3 = "aaaaaabbc";
        String input4 = "abbccbcd";

        String result1 = removeConsecutiveDuplicates(input1);
        String result2 = removeConsecutiveDuplicates(input2);
        String result3 = removeConsecutiveDuplicates(input3);
        String result4 = removeConsecutiveDuplicates(input4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    private static String removeConsecutiveDuplicates(String str) {
        /*
            Pseudo Code ->
                Step 0: Create stack for storing characters
                Step 1: Traverse through string and check if peek element == curr_ele, if yes, ignore, else add in stack
                Step 2: Print all peek elements and pop them and store in String that needs to be returned
         */
        Deque<Character> stack = new ArrayDeque<>();
        int size = str.length();
        stack.push(str.charAt(size-1));
        for(int i=size-2; i>=0; i--) {
            char ch = str.charAt(i);
            if(ch != stack.peek()) {
                stack.push(ch);
            }
        }
        StringBuffer result = new StringBuffer();
        for(Character ch: stack) {
            result.append(ch);
        }
        return result.toString();
    }

}
