package day17_While_DoWhile;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class FiverrCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();

        while (true) {
            System.out.println("what is your maths operator?");
            String input = new Scanner(System.in).nextLine();

            if (input.equals("-")){
                System.out.println((num1 - num2));
                break;
            }else if (input.equals("+")){
                System.out.println((num1 + num2));
                break;
            }else if (input.equals("*")){
                System.out.println((num1 * num2));
                break;
            }else if (input.equals("/")){
                System.out.println((num1 / num2));
                break;
            }
        }
        scan.close();



    }
}
