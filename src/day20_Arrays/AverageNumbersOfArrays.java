package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbersOfArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("please enter a number: ");
            numbers[i] = scan.nextInt();
            sum+=numbers[i]  ;
        }
        double average = sum/ numbers.length;
        System.out.println("average = " + average);

        System.out.println("-----------------------------");





    }
}
