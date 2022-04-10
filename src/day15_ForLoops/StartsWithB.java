package day15_ForLoops;

import java.util.Scanner;

public class StartsWithB {
    public static void main(String[] args) {

        System.out.println("Enter a word starting with B:");
        String word = new Scanner(System.in).next();

        if (word.charAt(0) == 'b'){
           word = word.replaceFirst("b","s");
        }
        System.out.println(word);
    }
}
