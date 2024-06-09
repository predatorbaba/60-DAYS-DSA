package day3_arrays;

public class RearrangeAlternatively {

    public static void main(String[] args) {
        long[] input1 = {1,2,3,4,5,6,7};
        long[] input2 = {10,20,30,40,50,60,70,80,90,100,110};
        long[] input3 = {1969,2677,3142,4631,4764,5748,6476};

        rearrangeAlternatively(input1);
        rearrangeAlternatively(input2);
        rearrangeAlternatively(input3);
    }

    private static void rearrangeAlternatively(long[] arr) {
        /*
            Pseudo Code ->
                Step 0: Handle base cases for size 0 and 1
                Step 1: Handle case for size 2
                Step 2: Take 2 index, one from beginning and another from end, as array is sorted
                Step 3: Take maxIndex -> arr[size-1], minIndex -> arr[0], maxElement -> maxElement + 1 (imaginary value), and traverse the array
                    Step 3.1: If (i%2==0) -> use maxIndex and maxElement to update value at arr[i], and maxIndex--
                    Step 3.2: Else -> use minIndex and maxElement to update arr[i] and minIndex--
                Step 4: At last, divide each element of array with maxElement
         */
        int size = arr.length;
        if(size == 0 || size == 1) return;
        if(size == 2) {
            long temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            return;
        }
        int minIndex = 0;
        int maxIndex = size - 1;
        long maxElement = arr[maxIndex] + 1;
        for(int i=0; i<size; i++) {
            if(i % 2 == 0) {
                arr[i] += (arr[maxIndex] % maxElement) * maxElement;
                maxIndex--;
            } else {
                arr[i] += (arr[minIndex] % maxElement) * maxElement;
                minIndex++;
            }
        }
        for(int i=0; i<size; i++) {
            arr[i] = arr[i]/maxElement;
        }
        printArray(arr);
    }

    private static void printArray(long[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

}
