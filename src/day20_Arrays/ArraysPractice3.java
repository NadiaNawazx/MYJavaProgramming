package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int length = scan.nextInt(); // length of the arrays

        if (length <= 0) {
            System.err.println("INVALID ENTRY");
            System.exit(0);
        }
        int [] numbers = new int[length]; // Array need to have enough capacity to
                                // contain all the elements user is going to enter

        for (int i = 0; i < length; i++) { //i:0
            System.out.println("Enter a number:");
            numbers [i] = scan.nextInt(); // each input user provided during each
                            // execution of the loop will be assigned to the
                            //indexs or the Array.
        }

        System.out.println(Arrays.toString(numbers));

        scan.close();
    }
}
