package MyTesting;

import java.util.Scanner;

public class ScannerPractice1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String str = input.next();

        System.out.println("Enter your Surname: ");
        String str1 = input.next();

        System.out.println("Enter Age: ");
        int num1 = input.nextInt();

        System.out.println("Enter a weight in KG: ");
        double num2 = input.nextDouble();

        System.out.println("First Name = " + str);
        System.out.println("Surname =    " + str1);
        System.out.println("Age =        " + num1+ " years old");
        System.out.println("Weight =     " + num2+" kg");




    }
}
