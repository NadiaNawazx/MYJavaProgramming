package day15_ForLoops;

import java.util.Scanner;

public class FiverrLettersDigitsSpecialChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.nextLine();

        String letter = "";
        String digit = "";
        String specialChar = "";

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (Character.isLetter(currentChar)){
                letter += currentChar;
            }else if (Character.isDigit(currentChar)){
                digit += currentChar;
            }else{
                specialChar += currentChar;

            }
        }

        System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);
        System.out.println("specialChar = " + specialChar);



    }
}
