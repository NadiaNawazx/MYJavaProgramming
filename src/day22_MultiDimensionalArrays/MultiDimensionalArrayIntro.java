package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        String[] g1 = {"Nadia, Manha, Zanib"};
        String[] g2 = {"Nazia, Mitti, Ayesha"};
        String[] g3 = {"Sadia, Annie, Hira"};

        String[][] groups = new String [3][];
        groups[0] = g1;
        groups[1] = g2;
        groups[2] = g3;

        //System.out.println(Arrays.toString(groups)); // toString is for one dimensional arrays only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("------------------------------------------");

        String [][] a = {{"Nadia, Manha, Zanib"}, {"Nazia, Mitti, Ayesha"}, {"Sadia, Annie, Hira"}};

        System.out.println("------------------------------------------");
    //Index of the elements 0  1  2     0  1  2     0  1  2  3  4
        int [][] arr2D = { {1, 2, 3} , {4, 5, 6} , {7, 8, 9,10,11} };
        //          index       0           1           2

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[2][4]);





            
        }
        
        

    }
