package day15_ForLoops;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str ="Java"; // avaJ
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(str);
        System.out.println(reverse);
    }
}

//	1. Write a program that can reverse any given string
//            String str = "Java"; ==> avaJ
///            		        0123
