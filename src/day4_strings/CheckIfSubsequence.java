package day4_strings;

public class CheckIfSubsequence {

    public static void main(String[] args) {
        String mainInput1 = "ABCDEF";
        String subStringInput1 = "ABD";
        String mainInput2 = "ABCD";
        String subStringInput2 = "BC";
        String mainInput3 = "ABCDEFGH";
        String subStringInput3 = "BCDE";
        String mainInput4 = "ABCDEF";
        String subStringInput4 = "AED";

        boolean result1 = isSubsequence(mainInput1, subStringInput1);
        boolean result2 = isSubsequence(mainInput2, subStringInput2);
        boolean result3 = isSubsequence(mainInput3, subStringInput3);
        boolean result4 = isSubsequence(mainInput4, subStringInput4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    private static boolean isSubsequence(String main, String subString) {
        /*
            Pseudo Code ->
                Step 0: Check base condition where main.length() > subString.length()
                Step 1: Traverse the string and match each char present in both string
                Step 2: Return when j == subString.length()
         */
        int mainSize = main.length();
        int subStringSize = subString.length();
        if(mainSize < subStringSize) return false;
        int j=0;
        for(int i=0; i<mainSize && j<subStringSize; i++) {
            char mainChar = main.charAt(i);
            char subStringChar = subString.charAt(j);
            if(mainChar == subStringChar) j++;
        }
        return (j == subStringSize);
    }

}
