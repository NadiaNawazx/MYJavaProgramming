package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 20,
                c = 30;
        //if we have 3 different number, one MUST be max, one MUST be min and one MUST be median.

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        /*
        in order for a to be the median number:
                1. if c is the max number & b is the min number
                2. if b is the max number & c is the min number then a is the median number.
         */
        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);
        /*
        for b to the middle number:
                1. c MUST be the max number & a MUST be the min number. "OR ||"
                2. a Must be the max number & c MUST be the min number.
=         */
        boolean cIsMedian = (c > a && c < b) || (c > b && c < a); // or you can type = !aIsMedian && !bIsMedian;
        /*
        for c to the middle number:
                1. b MUST be the max number & a MUST be the min number. "OR ||"
                2. a Must be the max number & b MUST be the min number.
=         */
        if (aIsMedian) { // if a is the median number
            System.out.println("a could be the median number");
        }
        if (bIsMedian) { // if b is the median number
            System.out.println("b could be the median number");
        }
        if (cIsMedian) { // if c is the median number
            System.out.println("c could be the median number");
        }


    }

}
/*
MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
 */