package day16_ForLoopsStringsPractice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        //index:      0123456789...

        String result = ""; //noopS nedooW
        // contains the reversed version of string.


        for (int i = str.length()-1; i >= 0; i--) {
            //i: index number of str (starting from last index to index 0)
            result += str.charAt(i); // += : adding each character to result.
        }
        System.out.println(result);


    }
}



/*
	1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */