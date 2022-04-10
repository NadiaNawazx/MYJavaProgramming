package day14_StringMethod;

import java.util.Scanner;

public class FiverrX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a work:");
        String word = scan.nextLine();

        if (word.toLowerCase().startsWith("x")){
            System.out.println(word.replace("x", ""));
        }
    }
}
