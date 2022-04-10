package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();//each user input with be assigned to the
                                // indexes of the array numbers
        }
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) { // if there is an element in the array that's smaller
                min = numbers[i];
            }
        }
        System.out.println("Numbers entered are: "+ Arrays.toString(numbers));
        System.out.println("Minimum number is: "+min);
        System.out.println("Maximum number is: "+max);
    }
}
