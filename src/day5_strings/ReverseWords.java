package day5_strings;

public class ReverseWords {

    public static void main(String[] args) {
        String input1 = "Hello World";
        String input2 = "My name is Raghav Goel";

        String result1 = reverseWords(input1);
        String result2 = reverseWords(input2);

        System.out.println(result1);
        System.out.println(result2);
    }

    private static String reverseWords(String str) {
        /*
            Pseudo Code ->
                Step 0: Split the string using <space> as delimeter, and store in String array
                Step 1: Create a StringBuffer and store the elements
         */
        String[] strArray = str.split(" ");
        StringBuffer result = new StringBuffer();

        for(int i=strArray.length-1; i>=0; i--) {
            result.append(strArray[i]).append(" ");
        }
        str = result.toString().strip();
        return str;
    }

}
