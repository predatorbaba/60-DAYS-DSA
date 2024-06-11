package day5_strings;

public class MaximumOccurrenceCharacter {

    public static void main(String[] args) {
        String input1 = "testsample";
        String input2 = "output";

        char result1 = findMaxOccurringCharacter(input1);
        char result2 = findMaxOccurringCharacter(input2);

        System.out.println(result1);
        System.out.println(result2);
    }

    private static char findMaxOccurringCharacter(String str) {
        /*
            Step 0: Create an int char array to maintain each char count
            Step 1: Traverse the string and for each occurrence of char, increase count by 1
            Step 2: Traverse the array and return the max occurring char
         */
        int CHAR = 256;
        int[] charArr = new int[CHAR];
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            charArr[ch]++;
        }
        int result = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0; i<CHAR; i++) {
            int prev_result = result;
            result = Math.max(result, charArr[i]);
            if(result > prev_result) index = i;
        }
        return (char) index;
    }

}
