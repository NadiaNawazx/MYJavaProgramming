package day11_Switch_Scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ENTER A INTERGER:");
        int num1 = input.nextInt();

        System.out.println("ENTER A DECIMAL");
        double num2 = input.nextDouble();

        System.out.println("Your selected INTERGER is: " + num1);
        System.out.println("Your selected DOUBLE number is: "+ num2);
        System.out.println("Multiply :"+ (num1*num2) );

        input.close();




    }


}
