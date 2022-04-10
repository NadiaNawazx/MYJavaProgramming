package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        //copyOf(array, newLength): copys the elements of the array,
        // starting from first element to given number,
        // returns new array

        String [] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String [] earlyBirds = Arrays.copyOf(students, 5);
        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("----------------------------------");

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        numbers = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(numbers));

        System.out.println("----------------------------------");

    //copyOfRange(array, beginningIndex, endingIndex):
        // copys the elements of the array, staring from
        // beginning index till the ending index
        // (ending index excluded), returns new array
        // SIMILAR TO SUBSTRING

        char [] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char [] ch2 = Arrays.copyOfRange(ch1, 2,6+1);
        System.out.println(Arrays.toString(ch2));

        System.out.println("----------------------------------");

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        //index:        1   2  3  4  5  6  7  8  9  10
        int[] result = Arrays.copyOfRange(scores,3,7+1);
        System.out.println(Arrays.toString(result));

        System.out.println("----------------------------------");

        int[]result2 = Arrays.copyOfRange(scores, 5, scores.length);
        System.out.println(Arrays.toString(result2));





    }
}
