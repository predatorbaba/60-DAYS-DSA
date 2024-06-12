package day6_strings;

public class MinimumIndexedCharacter {

    public static void main(String[] args) {
        String main1Input1 = "raghavgoel";
        String main2Input1 = "avg";
        String main1Input2 = "adcffaet";
        String main2Input2 = "onkl";

        int result1 = findMinimumIndexedCharacter(main1Input1, main2Input1);
        int result2 = findMinimumIndexedCharacter(main1Input2, main2Input2);

        System.out.println(result1);
        System.out.println(result2);
    }

    private static int findMinimumIndexedCharacter(String str1, String str2) {
        /*
            Step 0: Create an int char array to store the count of occurrence of each char present in concatenated string
            Step 1: Traverse str1 and str2 separately and only store the first occurrence, which means if str1 contains 2 aa, we can only add 1 time, 2nd time will be ignored, similarly for str2
            Step 2: Traverse the char array and check where value > 1, and check the index of that char in str1 and store in index variable
         */
        int CHAR = 256;
        int[] charArr = new int[CHAR];
        for(int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);
            if(charArr[ch] == 0) charArr[ch]++;
        }
        for(int i=0; i<str2.length(); i++) {
            char ch = str2.charAt(i);
            if(charArr[ch] == 1) charArr[ch]++;
        }
        int index = Integer.MAX_VALUE;
        for(int i=0; i<CHAR; i++) {
            if(charArr[i] > 1) {
                char ch = (char) i;
                int chIndex = str1.indexOf(ch);
                index = Math.min(index, chIndex);
            }
        }
        return (index == Integer.MAX_VALUE) ? -1 : index;
    }

}
