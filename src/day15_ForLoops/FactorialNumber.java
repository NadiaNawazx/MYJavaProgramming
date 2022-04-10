package day15_ForLoops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scan.nextInt();
        int factorialNumber = 1;

        for (int i = number; i >= 1; i--) {
            factorialNumber *= i;
        }
        System.out.println("factorialNumber = " + factorialNumber);
    }
}
