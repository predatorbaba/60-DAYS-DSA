package day4_strings;

public class LeftmostRepeatingCharacter {

    public static void main(String[] args) {
        String input1 = "geeksforgeeks";
        String input2 = "abbcc";
        String input3 = "abcd";

        int result1 = leftmostRepeatingCharacterIndex(input1);
        int result2 = leftmostRepeatingCharacterIndex(input2);
        int result3 = leftmostRepeatingCharacterIndex(input3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static int leftmostRepeatingCharacterIndex(String str) {
        /*
            Pseudo Code ->
                Step 0: Create a boolean CHAR array with default values as false
                Step 1: Traverse the string from end to start, and check if already visited
                Step 2: If visited, update index variable value
                Step 3: If not, update visited array with true
         */
        int strLength = str.length();
        boolean[] isVisited = new boolean[256];
        int latestIndex = -1;
        for(int i=strLength-1; i >= 0; i--) {
            char ch = str.charAt(i);
            if(isVisited[ch]) latestIndex = i;
            else isVisited[ch] = true;
        }
        return latestIndex;
    }

}
