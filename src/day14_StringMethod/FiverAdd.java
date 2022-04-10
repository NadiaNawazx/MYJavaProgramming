package day14_StringMethod;

import java.util.Scanner;

public class FiverAdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word1 = scan.nextLine();

        System.out.println("Enter a word:");
        String word2 = scan.nextLine();

        char firstChar = word2.charAt(0);
        char secondChar = word1.charAt(word1.length()-1);

        if (firstChar == secondChar){
            System.out.print(word1);
            System.out.print(word2.substring(1));
        }else{
            System.out.print(word1+word2);
        }
        scan.close();





    }
}
