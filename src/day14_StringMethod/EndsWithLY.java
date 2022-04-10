package day14_StringMethod;

import java.util.Scanner;

public class EndsWithLY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scan.next();

        String lastTwoChar = word.substring( word.length()-2);
        String result = "";

        if (lastTwoChar.equals( "ly" )) {
            result = "really???";
        }else{
            result = "never mind";
        }
        System.out.println(result);


        scan.close();
    }
}
/*      2. ask the user to enter a word.
        if the word ends with "ly", print "really???" ,
        otherwise, print "never mind"

 */