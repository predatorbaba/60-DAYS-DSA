package day1_arrays;

public class PrintLeaders {

    public static void main(String[] args) {
        int[] input1 = {7,10,4,3,6,5,2};
        int[] input2 = {};
        int[] input3 = {10,20,30};
        int[] input4 = {30,20,10};

        printLeaders(input1);
        printLeaders(input2);
        printLeaders(input3);
        printLeaders(input4);
    }

    private static void printLeaders(int[] arr) {
        /*
            What is leader: If there is no greater element on the right side of curr_ele, and rightmost element is always leader
            Pseudo Code ->
                Step 0: Handle base cases for size 0, and 1
                Step 1: As we know rightmost is always leader, so, we will start traversal from right
                    Step 1.1: Store last element in a variable
                    Step 1.2: Check (curr_leader < curr_ele) -> update curr_leader and print
         */
        int size = arr.length;
        if(size == 0) return;
        if(size == 1) {
            System.out.println(arr[0]);
            return;
        }
        int curr_leader = arr[size-1];
        System.out.print(curr_leader+",");
        for(int i=size-1; i>=0; i--) {
            if(curr_leader < arr[i]) {
                curr_leader = arr[i];
                System.out.print(curr_leader+",");
            }
        }
        System.out.println();
    }

}
