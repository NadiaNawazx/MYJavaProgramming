package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class IteratingMultiDimensionalLoop {
    public static void main(String[] args) {

        //Index of the elements 0  1  2     0  1  2     0  1  2  3  4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10, 11}};
        //          index       0           1           2

        for (int i = 0; i < arr2D.length; i++) { // i; index number of single dimensional arrays
            //System.out.println(Arrays.toString(arr2D[i]));

            for (int j = 0; j < arr2D[i].length; j++) { //j; index number of elements

                System.out.print((arr2D[i][j]) + " ");

            }
            System.out.println();

        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < arr2D.length; i++) { //i: indexes of each 1D array starting from 0
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j] + " ");

            }

            System.out.println();
        }


/*
3 2 1
6 5 4
11 10 9 8 7

 */

        System.out.println("-----------------------------------");




            }

/*
11 10 9 8 7
6 5 4
3 2 1
*/


        }
