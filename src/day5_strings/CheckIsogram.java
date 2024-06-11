package day5_strings;

public class CheckIsogram {

    public static void main(String[] args) {
        String input1 = "RaghavGoel";
        String input2 = "machine";
        String input3 = "streaks";

        boolean result1 = checkIfIsogram(input1);
        boolean result2 = checkIfIsogram(input2);
        boolean result3 = checkIfIsogram(input3);

        System.out.println(result1 ? 1 : 0);
        System.out.println(result2 ? 1 : 0);
        System.out.println(result3 ? 1 : 0);
    }

    private static boolean checkIfIsogram(String str) {
        /*
            Pseudo Code ->
                Step 0: Create an int char array to store the count
                Step 1: For each char, increase the count by 1
                Step 2: Traverse the int char array to check if any char count > 1, if yes, return false
         */
        int CHAR = 256;
        int[] charArr = new int[CHAR];
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            charArr[ch]++;
        }
        for(int i=0; i<CHAR; i++) {
            if(charArr[i] > 1) return false;
        }
        return true;
    }

}
