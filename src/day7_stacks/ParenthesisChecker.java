package day7_stacks;

import java.util.ArrayDeque;

public class ParenthesisChecker {

    public static void main(String[] args) {
        String input1 = "{{{[[[((()))]]]}}}";
        String input2 = "{{{[[((()))]]]}}}";
        String input3 = "{{{[[[((()))]]]}}";
        String input4 = "{{{[[[(()))]]}}}";

        boolean result1 = parenthesisChecker(input1);
        boolean result2 = parenthesisChecker(input2);
        boolean result3 = parenthesisChecker(input3);
        boolean result4 = parenthesisChecker(input4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    private static boolean parenthesisChecker(String str) {
        /*
            Pseudo Code ->
                Step 0: Push all the brackets which are open in the stack
                Step 1: Check if current_ele is closed or not, if not return false else, pop relevant open bracket from stack
         */
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if(ch == ')') {
                if(!stack.isEmpty()) {
                    char peek = stack.peek();
                    if (peek == '(') stack.pop();
                    else return false;
                }
                else return false;
            }
            else if(ch == '}') {
                if(!stack.isEmpty()) {
                    char peek = stack.peek();
                    if(peek == '{') stack.pop();
                    else return false;
                }
                else return false;
            }
            else if(ch == ']') {
                if(!stack.isEmpty()) {
                    char peek = stack.peek();
                    if(peek == '[') stack.pop();
                    else return false;
                }
                else return false;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }

}
