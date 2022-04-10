package day15_ForLoops;

import java.util.Scanner;

public class FiverrDigitsFromString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word with numbers");
        String word = scan.nextLine();

        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isDigit(ch)){
                int num = Integer.parseInt(String.valueOf(ch));
                sum += num;
            }
        }
        System.out.println(sum);







    }
}
/*    6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...

 */