package day12_Scanner;

import java.util.Scanner;

public class CentToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cent: ");
        int centsInput = scan.nextInt();

        int dollar = centsInput / 100;
        int cents = centsInput % 100;

        System.out.println(centsInput + " cents equal to: " +dollar+ " dollars and " + cents + " cents");

scan.close();


    }
}
