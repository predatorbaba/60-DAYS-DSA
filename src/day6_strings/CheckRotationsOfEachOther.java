package day6_strings;

public class CheckRotationsOfEachOther {

    public static void main(String[] args) {
        String main1Input1 = "raghavgoelindia";
        String main2Input1 = "indiaraghavgoel";
        String main1Input2 = "mightandmagic";
        String main2Input2 = "andmagicmigth";

        boolean result1 = checkIfRotationsOfEachOther(main1Input1, main2Input1);
        boolean result2 = checkIfRotationsOfEachOther(main1Input2, main2Input2);

        System.out.println(result1 ? 1 : 0);
        System.out.println(result2 ? 1 : 0);
    }

    private static boolean checkIfRotationsOfEachOther(String str1, String str2) {
        /*
            Pseudo Code ->
                Step 0: Check base condition, length of both strings needs to be same
                Step 1: Concatenate str1 in str1 and check str2 is present in concatenated string or not
         */
        if(str1.length() != str2.length()) return false;
        String concatenatedString = str1.concat(str1);
        return (concatenatedString.indexOf(str2) != -1);
    }

}
