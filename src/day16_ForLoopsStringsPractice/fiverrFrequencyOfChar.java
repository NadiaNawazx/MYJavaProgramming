package day16_ForLoopsStringsPractice;

import java.util.Scanner;

public class fiverrFrequencyOfChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = scan.nextLine();
        char ch = scan.nextLine().charAt(0);

        int count =0;

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            if (ch == ch1){
              count++;
            }
        }
        System.out.println(count);




    }
}
