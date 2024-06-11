package day5_strings;

public class BinaryString {

    public static void main(String[] args) {
        String input1 = "1111";
        String input2 = "01101";

        int result1 = binaryStrings(input1);
        int result2 = binaryStrings(input2);

        System.out.println(result1);
        System.out.println(result2);
    }

    private static int binaryStrings(String str) {
        /*
            Pseudo Code ->
                Step 0: Take a variable to store number of 1's in a string
                Step 1: Calculate the number of binary strings that starts with 1 and ends with 1
         */
        int numberOfOnes = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '1') numberOfOnes++;
        }
        return numberOfOnes * (numberOfOnes - 1) / 2;
    }

}
