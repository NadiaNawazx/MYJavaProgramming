package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        //Index of the elements 0  1  2     0  1  2     0  1  2  3  4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10, 11}};
        //          index       0           1           2
/*
        for( int[] each1DArray : arr2D){
            for ( int eachElement : each1DArray)
            System.out.print(eachElement);
        }
        System.out.println();
*/
        /*
3 2 1
6 5 4
11 10 9 8 7

 */
        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.print(eachElement);

            }
        }
    }
}
