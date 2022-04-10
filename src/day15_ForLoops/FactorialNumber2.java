package day15_ForLoops;

import java.util.Scanner;

public class FactorialNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = 0;
        int sum = 0;

        System.out.println("Enter a number:");
        number = scan.nextInt();

        for (int i = 0; i <=number ; i++) {
        sum += i;
        }
        System.out.println("Your sum is = "+sum);

    }
}
