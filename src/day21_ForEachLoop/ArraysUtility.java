package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

            //toString(array): converts the array object
            // (single dimensional) to string, returns string
        int [] nums = {1,2,3,4,5,6};
        System.out.println(nums); //hashcode
        System.out.println(Arrays.toString(nums));
            //converts from array to String. Single dimensional.
        System.out.println(nums[0]);
            // prints the 1st index

        /*String str = "Java";
        System.out.println(str);
        System.out.println(str.toString());
*/

        System.out.println("----------------------------------");

        //sort():sorts the array in ascending order, eg 1,2,3,4,5,6
        //                                              a,b,c,d,e,f

        int[] scores = {95,100,55,65,85,78};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println( Arrays.toString (scores) );

        System.out.println( "Min Score: " + scores[0] );
        System.out.println( "Max Score: " + scores[scores.length-1] );

        String [] names = {"Nawaz", "Nazia", "Manha", "Zanib", "Hira", "Annie", "Saif","Nadia" };
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String [] words = {"Anna", "ANNA"};//follows the Ascii table
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));


        System.out.println("----------------------------------");


        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("----------------------------------");

        //equals(array1, array2): checks if two arrays are equal,...
        // ...returns boolean
        char[] ch1 = {'a', 'd', 'e', 'b', 'c'};//adebc
        char[] ch2 = {'e', 'c', 'a', 'd', 'b'};//ecadb
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);

        System.out.println("----------------------------------");






        System.out.println("----------------------------------");







    }
}
