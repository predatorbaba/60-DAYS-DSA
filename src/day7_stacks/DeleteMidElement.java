package day7_stacks;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Deque;

public class DeleteMidElement {

    public static void main(String[] args) {
        ArrayDeque<Integer> stack1 = new ArrayDeque<>();
        ArrayDeque<Integer> stack2 = new ArrayDeque<>();

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);

        stack2.push(100);
        stack2.push(200);
        stack2.push(300);
        stack2.push(400);

        deleteMidElement(stack1);
        deleteMidElement(stack2);
    }

    private static void deleteMidElement(ArrayDeque<Integer> stack) {
        /*
            Pseudo Code ->
                Step 0: Find size of stack and find mid-index
                Step 1: Once mid found, create a temp stack to store elements from stack until mid reached
                Step 2: Once reached mid, pop the element and put elements from temp stack to original stack
         */
        int size = stack.size();
        if(stack.isEmpty()) return;
        int midIndex = size / 2;
        ArrayDeque<Integer> backupStack = new ArrayDeque<>();
        for(int i=0; i<midIndex; i++) {
            Integer currentElement = stack.peek();
            stack.pop();
            backupStack.push(currentElement);
        }
        stack.pop();
        while(!backupStack.isEmpty()) {
            Integer currentElement = backupStack.peek();
            stack.push(currentElement);
            backupStack.pop();
        }
        for(Integer i: stack) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
