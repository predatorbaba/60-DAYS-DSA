package day3_arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintPattern {

    public static void main(String[] args) {
        int input1 = 16;
        int input2 = 10;

        List<Integer> result1 = printPattern(input1);
        List<Integer> result2 = printPattern(input2);

        for(Integer i: result1) {
            System.out.print(i+" ");
        }
        System.out.println();
        for(Integer i: result2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static List<Integer> printPattern(int value) {
        /*
            Explanation ->
                Print a sequence of numbers starting with N, without using loop, where replace N with N - 5, until N > 0. After that replace N with N + 5 until N regains its initial value.
            Pseudo Code ->
                Step 0: Take care of positive part N - 5
                Step 1: Take care when N < 0, and make it positive again until regain initial value
         */
        List<Integer> decreasingSequence = Stream.iterate(value, x -> x > 0, x -> x - 5)
                .toList();

        // Add the value when it becomes zero or less than zero
        decreasingSequence.add(decreasingSequence.get(decreasingSequence.size() - 1) - 5);

        // Correctly start the increasing sequence from the last element of the decreasing sequence
        List<Integer> increasingSequence = Stream.iterate(decreasingSequence.get(decreasingSequence.size() - 1) + 5, x -> x <= value, x -> x + 5)
                .toList();
        List<Integer> result = new ArrayList<>(decreasingSequence);
        result.addAll(increasingSequence);
        return result;
    }

}
