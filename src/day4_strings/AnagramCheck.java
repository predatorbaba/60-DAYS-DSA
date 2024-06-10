package day4_strings;

public class AnagramCheck {

    public static void main(String[] args) {
        String str1Input1 = "silent";
        String str2Input1 = "listen";
        String str1Input2 = "abcde";
        String str2Input2 = "acebd";
        String str1Input3 = "hello";
        String str2Input3 = "helyo";

        boolean result1 = isAnagram(str1Input1, str2Input1);
        boolean result2 = isAnagram(str1Input2, str2Input2);
        boolean result3 = isAnagram(str1Input3, str2Input3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static boolean isAnagram(String str1, String str2) {
        /*
            Pseudo Code ->
                Step 0: Check length of both strings, needs to be same
                Step 1: Take an int char array and traverse the string
                Step 2: For every char at str1.charAt(i) increment and vice versa
         */
        int str1Length = str1.length();
        int str2Length = str2.length();
        if(str1Length != str2Length) return false;
        int[] charArr = new int[256];
        for(int i=0; i<str1Length; i++) {
            charArr[str1.charAt(i)]++;
            charArr[str2.charAt(i)]--;
        }
        for(int i=0; i<charArr.length; i++) {
            if(charArr[i] != 0) return false;
        }
        return true;
    }

}
