package day17_While_DoWhile;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt(); //valid age: 1 ~ 120

        while(! (age >= 1 && age <= 120) ) {
            System.err.println("INVALID *** Re-Enter your age: ");
            System.err.println("Enter your age: ");
            age = scan.nextInt();
        }
            System.out.println("Are you a US Citizen? yes/no");
            String citizen = scan.next();

            while (!(citizen.equalsIgnoreCase("yes") || citizen.equalsIgnoreCase("no"))){
                System.err.println("INVALID **** Re-Enter your Citizenship: ");
                System.err.println("Are you a US Citizen? yes/no");
                citizen = scan.next();
            }

            if (age >= 18 && citizen.equalsIgnoreCase("yes")){
                System.out.println("YOU ARE ELIGIBLE TO VOTE");
            }else{
                System.err.println("YOU ARE NOT ELIGIBLE TO VOTE");
            }


    }




    }

