package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                System.out.println("Enter your 1st number: ");
                int firstNumber = scan.nextInt();

                System.out.println("Enter your 2nd number: ");
                int secondNumber = scan.nextInt();

                System.out.println("Enter a maths operator: ");
                char ch = scan.next().charAt(0); //+,-
                while (!(ch == '+' || ch == '-' )){
                        System.err.println("INVALID ENTRY - PLEASE RE-ENTER");
                        ch = scan.next().charAt(0);

                }
                System.out.println((ch == '+')? firstNumber + secondNumber :firstNumber - secondNumber );



        }
}