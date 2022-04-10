package day14_StringMethod;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** ENTER A WORD STARTING WITH 'X' ***" );
        System.out.println();
        System.out.println("Enter a word: ");
        String word = scan.next();
        String result = "";
        scan.close();

        if (word.charAt(0)=='x'){
          word = word.substring(1);
        }
        System.out.println(word);

    }
}
/*
    3. Ask user to enter a word.
    If the work starts with x,
    print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
