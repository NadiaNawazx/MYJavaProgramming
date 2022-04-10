package day17_While_DoWhile;

import java.util.Scanner;

public class MarryMe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you Marry Me? ");

        String marry = scan.next();

        while (!(marry.equalsIgnoreCase("yes") || marry.equalsIgnoreCase("No"))) {
            System.err.println("Invalid answer, please re-enter");
            marry = scan.next();
        }
            if (marry.equalsIgnoreCase("yes")) {
                System.out.println("********* Congratulations *********");
            } else {
                System.out.println("Goodbye :(");
            }
        }
    }

/*
Task:
	1. Write a program for the  marriage proposal program asking the user,
	"Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
   */
