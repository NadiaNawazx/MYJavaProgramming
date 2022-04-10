package day16_ForLoopsStringsPractice;

import java.util.Scanner;

public class Group9Example {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below

        String vowels = "aeiou";

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.toLowerCase().substring(i,i+1))){
                System.out.print(word.substring(i,i+1));
            }

            System.out.println("______________________");






        }
    }
}