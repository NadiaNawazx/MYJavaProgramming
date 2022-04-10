package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names.

        String [] myGroups = new String[5];
        myGroups[0] = "Nadia";
        myGroups[1] = "Manha";
        myGroups[2] = "Zanib";
        myGroups[3] = "Nazia";
        myGroups[4] = "Mitti";

        //System.out.println(myGroups); // hashcode
        System.out.println( Arrays.toString(myGroups)); // ["Nadia", "Manha", "Zanib", "Nazia', "Mitti"]

        System.out.println("---------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int number = 5;

        if (number < 1 || number > 7){
            System.err.println("INVALID NUMBER");
            System.exit(0);
        }
        System.out.println((days [number-1]));




    }
}
