package day5_strings;

public class RemoveCommonCharactersAndConcat {

    public static void main(String[] args) {
        String main1Input1 = "Timepass";
        String main1Input2 = "esp";
        String main2Input1 = "HelloWorld";
        String main2Input2 = "lWo";
        String main3Input1 = "RaghavGoel";
        String main3Input2 = "ghG";
        String main4Input1 = "RaghavGoelGoel";
        String main4Input2 = "havo";
        String main5Input1 = "aacdb";
        String main5Input2 = "gafd";
        String main6Input1 = "abcs";
        String main6Input2 = "cxzca";

        String result1 = removeCommonCharacterAndConcat(main1Input1, main1Input2);
        String result2 = removeCommonCharacterAndConcat(main2Input1, main2Input2);
        String result3 = removeCommonCharacterAndConcat(main3Input1, main3Input2);
        String result4 = removeCommonCharacterAndConcat(main4Input1, main4Input2);
        String result5 = removeCommonCharacterAndConcat(main5Input1, main5Input2);
        String result6 = removeCommonCharacterAndConcat(main6Input1, main6Input2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }

    private static String removeCommonCharacterAndConcat(String str1, String str2) {
        /*
            Pseudo Code ->
                Step 0: Create an int char array to maintain the count for all char present in str1 and str2
                Step 1: For each char, increase count by 1
                Step 2: Traverse the char array to get only chars where count == 1, and store in a string
         */
        int CHAR = 256;
        int[] charArr = new int[256];
        String concatenatedStr = str1.concat(str2);
        for(int i=0; i<concatenatedStr.length(); i++) {
            char ch = concatenatedStr.charAt(i);
            charArr[ch]++;
        }
        StringBuffer resultStr = new StringBuffer();
        for(int i=0; i<CHAR; i++) {
            if(charArr[i] == 1) {
                char c = (char) i;
                resultStr.append(c);
            }
        }
        return resultStr.toString();
    }

}
