package day4_strings;

import java.util.Arrays;

public class LeftmostNonRepeatingCharacter {

    public static void main(String[] args) {
        String input1 = "geeksforgeeks";
        String input2 = "apple";
        String input3 = "abcabc";

        int result1 = leftmostNonRepeatingCharacterIndex(input1);
        int result2 = leftmostNonRepeatingCharacterIndex(input2);
        int result3 = leftmostNonRepeatingCharacterIndex(input3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static int leftmostNonRepeatingCharacterIndex(String str) {
        /*
            Pseudo Code ->
                Step 0: Create an int array with default values as -1
                Step 1: Traverse the string from 0 to length, and for every first occurrence, make the value as index
                Step 2: For rest of the occurrences, make it as -2.
                Step 3: Traverse the int array, and check for the first 0 valued index
         */
        int[] charArr = new int[256];
        Arrays.fill(charArr, -1);
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(charArr[ch] == -1) charArr[ch] = i;
            else charArr[ch] = -2;
        }
        int result = Integer.MAX_VALUE;
        for(int i=0; i<charArr.length; i++) {
            if(charArr[i] >= 0) {
                result = Math.min(result, charArr[i]);
            }
        }
        return (result == Integer.MAX_VALUE) ? -1 : result;
    }

}
