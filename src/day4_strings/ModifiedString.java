package day4_strings;

public class ModifiedString {

    public static void main(String[] args) {
        String input1 = "aaaaa";
        String input2 = "ppwwwwvvvvvkkkzzzznnnttttqqqqwwwwwvvv";

        long result1 = modifyString(input1);
        long result2 = modifyString(input2);

        System.out.println(result1);
        System.out.println(result2);
    }

    private static long modifyString(String str) {
        /*
            What is modified String?
                -  The string should not have three consecutive same characters (Refer example for explanation).
                -  He can add any number of characters anywhere in the string.
            Pseudo Code ->
                Step 0: Take 2 variables to store number of replacements and tracking 3 consecutive characters
                Step 2: Traverse the string and check curr == curr - 1 and perform following
                    Step 2.1: If yes, update count by 1, and if count == 3, perform a replacement and reset the count
                    Step 2.2: If No, reset the count to 1 if new character comes
         */
        int strLength = str.length();
        long count = 1;
        long replacements = 0;
        for(int i=1;i<strLength; i++) {
            char curr_char = str.charAt(i);
            char prev_char = str.charAt(i-1);
            if(curr_char == prev_char) {
                count++;
                if(count == 3) {
                    count = 1;
                    replacements++;
                }
            } else {
                count = 1;
            }

        }
        return replacements;
    }

}
