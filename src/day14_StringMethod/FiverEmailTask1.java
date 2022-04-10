package day14_StringMethod;

import java.util.Scanner;

public class FiverEmailTask1 {

    public static void main(String[] args) {
        System.out.println("Enter an email address please");

        Scanner scan = new Scanner(System.in);
        String address = scan.nextLine();

        if (!address.contains("_") || !address.contains("@")) {
            System.out.println(address);
            return;
        }

        String nameSection = address.split("@")[0];
        String firstName = nameSection.split("_")[0];
        String lastName = nameSection.split("_")[1];

        System.out.println(lastName + "_" + firstName + "@" + address.split("@")[1]);

    }
}

//    7. Create a class called EmailTask1.
//        Assume that email address is constructed by person's first name and followed by an underscore and last name.
//
//        Write a program that can swap first name with last name in the email (Seperated by an underscore).
//        If the email doesn't contain an underscore print the given input email.
//
//        Ex:
//        input: mike_tyson@gmail.com
//                output: tyson_mike@gmail.com

