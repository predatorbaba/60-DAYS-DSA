package day5_strings;

public class CheckIfSubstring {

    public static void main(String[] args) {
        String mainInput1 = "Timepass";
        String subStringInput1 = "es";
        String mainInput2 = "HelloWorld";
        String subStringInput2 = "Wor";
        String mainInput3 = "RaghavGoel";
        String subStringInput3 = "aG";
        String mainInput4 = "RaghavGoelGoel";
        String subStringInput4 = "Goel";

        int result1 = findSubstring(mainInput1, subStringInput1);
        int result2 = findSubstring(mainInput2, subStringInput2);
        int result3 = findSubstring(mainInput3, subStringInput3);
        int result4 = findSubstring(mainInput4, subStringInput4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    private static int findSubstring(String str1, String str2) {
        /*
            Pseudo Code ->
                Step 0: Check if str1 contains str2, if not return
                Step 1: Find index of str2 in str1
         */
        boolean isStr2Present = str1.contains(str2);
        if(!isStr2Present) return -1;
        return str1.indexOf(str2);
    }

}
