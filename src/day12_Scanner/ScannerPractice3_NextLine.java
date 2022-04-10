package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:" );
        String fullname = scan.nextLine();

        System.out.println("Enter your programming language:" );
        String programming = scan.nextLine();

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your school name:" );
        String school = scan.nextLine();

        System.out.println("name = " + fullname);
        System.out.println("language = " + programming);
        System.out.println("age = " + age);
        System.out.println("school = " +school);

        scan.close();

    }
}
