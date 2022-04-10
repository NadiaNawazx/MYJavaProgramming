package day14_StringMethod;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st word:");
        String firstWord = scan.next();

        System.out.println("Enter 2nd word: ");
        String secondWord = scan.next();

        scan.close();

        String result = "";

        if(firstWord.charAt( firstWord.length()-1) == secondWord.charAt(0)){
            result = firstWord+ secondWord.substring(1);
        }else{
            result = firstWord+secondWord;
        }

        System.out.println(result);


    }

}


/*
    1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */