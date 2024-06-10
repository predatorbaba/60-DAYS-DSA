package day4_strings;

public class PalindromeCheck {

    public static void main(String[] args) {
        String input1 = "ABCDCBA";
        String input2 = "XYZZYX";
        String input3 = "ABCDECBA";

        boolean result1 = isPalindrome(input1);
        boolean result2 = isPalindrome(input2);
        boolean result3 = isPalindrome(input3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static boolean isPalindrome(String str) {
        /*
            Pseudo Code ->
                Step 0: Take 2 variable as index, one from start and one from end
                Step 1: Check if str.charAt(start) == str.charAt(end)
                    Step 1.1: If yes, continue until start < end
                    Step 1.2: Else, return false
         */
        int startIndex = 0;
        int endIndex = str.length() - 1;
        while(startIndex < endIndex) {
            char startChar = str.charAt(startIndex);
            char endChar = str.charAt(endIndex);
            if(startChar != endChar) return false;
            startIndex++;
            endIndex--;
        }
        return true;
    }

}
