package day6_strings;

public class KeypadTyping {

    public static void main(String[] args) {
        String input1 = "raghavgoel";
        String input2 = "helloworld";
        String input3 = "datastructure";

        String result1 = printNumber(input1);
        String result2 = printNumber(input2);
        String result3 = printNumber(input3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static String printNumber(String s) {
        /*
            Pseudo Code ->
                Step 0: Create string buffer object to append the numbers as per characters
                Step 1: Use if else condition to check the characters range and append the relevant number in result accordingly
         */
        StringBuffer result = new StringBuffer();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'c') {
                result.append('2');
            } else if(ch >= 'd' && ch <= 'f') {
                result.append('3');
            } else if(ch >= 'g' && ch <= 'i') {
                result.append('4');
            } else if(ch >= 'j' && ch <= 'l') {
                result.append('5');
            } else if(ch >= 'm' && ch <= 'o') {
                result.append('6');
            } else if(ch >= 'p' && ch <= 's') {
                result.append('7');
            } else if(ch >= 't' && ch <= 'v') {
                result.append('8');
            } else if(ch >= 'w' && ch <= 'z') {
                result.append('9');
            }
        }
        return result.toString();
    }

}
