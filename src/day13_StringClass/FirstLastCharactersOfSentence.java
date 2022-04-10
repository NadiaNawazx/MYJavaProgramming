package day13_StringClass;

import java.util.Scanner;

public class FirstLastCharactersOfSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word:");

        String word = scan.next();

        scan.close();

        char firstChar =word.charAt(0),
                lastChar =word.charAt(word.length()-1);
        if (firstChar == lastChar){
            System.out.println("SAME");
        }else  {
            System.out.println("NOT the same");
        }


    }
}
