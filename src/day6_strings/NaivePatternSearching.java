package day6_strings;

public class NaivePatternSearching {

    public static void main(String[] args) {
        String mainInput1 = "ABCDBCDAABCD";
        String patternInput1 = "ABCD";

        naivePatternSearching(mainInput1, patternInput1);
    }

    private static void naivePatternSearching(String str, String pattern) {
        /*
            Pseudo Code ->
                Note: Kind of sliding window technique, where we are moving window (str2) by 1 for every mismatch
                Step 0: Traverse the str1, and traverse the str2 inside str1
                Step 1: Compare elements in str1 and str2, if not matched, move to next index
         */
        for(int i=0; i<=str.length()-pattern.length(); i++) {
            int j;
            for(j=0; j<pattern.length(); j++) {
                if(str.charAt(i+j) != pattern.charAt(j)) break;
            }
            if(j == pattern.length()) {
                System.out.println(i);
            }
        }
    }

}
