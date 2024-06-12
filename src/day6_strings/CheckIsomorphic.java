package day6_strings;

import java.util.HashMap;

public class CheckIsomorphic {

    public static void main(String[] args) {
        String main1Input1 = "aab";
        String main2Input1 = "xxy";
        String main1Input2 = "aab";
        String main2Input2 = "xyz";

        boolean result1 = checkIsomorphic(main1Input1, main2Input1);
        boolean result2 = checkIsomorphic(main1Input2, main2Input2);

        System.out.println(result1 ? 1 : 0);
        System.out.println(result2 ? 1 : 0);
    }

    private static boolean checkIsomorphic(String str1, String str2) {
        /*
            Pseudo Code ->
                Step 0: Check base condition, length of both strings needs to be same
                Step 1: Create a Character HashMap for storing the str1 as key and str2 as values
                Step 2: Traverse the str1 and str2, and check the following:
                    Step 2.1: Insertion in hashmap is only possible when str1 char as key and str2 char as key is not present in hashmap
                    Step 2.2: If either one is present in hashmap, we can directly return false as this is not a isomorphic string and there is no need of further checking
         */
        int str1Length = str1.length();
        int str2Length = str2.length();
        if(str1Length != str2Length) return false;
        HashMap<Character,Character> hashMap = new HashMap<>();
        for(int i=0; i<str1Length; i++) {
            char str1Char = str1.charAt(i);
            char str2Char = str2.charAt(i);
            if(!hashMap.containsKey(str1Char)) {
                if(!hashMap.containsValue(str2Char)) {
                    hashMap.put(str1Char, str2Char);
                } else return false;
            } else {
                if(hashMap.get(str1Char) != str2Char) return false;
            }
        }
        return true;
    }

}
