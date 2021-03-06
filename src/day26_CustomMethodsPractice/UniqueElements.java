package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1,1,1,2,3,4,5,5,6,6,6,7,7};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));

        System.out.println("----------------");

        double[] array2 = {1.5,1.5,1.5,2.5,3.5,4.5,5.5,5.5,6.5,6.5,6.5,7.5,7.5};
        double[] unique2 = uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));

        System.out.println("----------------");

        char[] array3 = {'a','a','b', 'c', 'c'};
        char[] unique3 = uniqueElements(array3);
        System.out.println(Arrays.toString(unique3));

        System.out.println("----------------");

        String[] array4 = {};
        String[] unique4 = uniqueElements(array4);
        System.out.println(Arrays.toString(unique4));



    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements (int[] array){
        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the element is 1 the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;

    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements (double[] array){
        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the element is 1 the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;

    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements (char[] array){
        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the element is 1 the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;

    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements (String[] array){
        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the element is 1 the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;

    }





}
