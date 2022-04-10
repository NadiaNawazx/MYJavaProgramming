package day14_StringMethod;

import java.util.Scanner;

public class FiverrrDigitalUpperLowerSpecialChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.nextLine();
        scan.close();

        char firstChar = word.charAt(0);

        if (Character.isDigit(firstChar)){
            System.out.println("first character is digit");
        }else if (Character.isLetter(firstChar)&& Character.isUpperCase(firstChar)){
            System.out.println("first character is uppercase letter");
        }else if (Character.isLetter(firstChar)&& Character.isLowerCase(firstChar)){
            System.out.println("first character is lowercase letter");
        }else{
            System.out.println("first character is special character");
        }


    }
}
