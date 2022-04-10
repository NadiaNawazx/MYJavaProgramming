package day20_Arrays;

import java.sql.SQLOutput;

public class Months {
    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November","December",};

        int number = 9;

        if (number <1 || number >12){
            System.err.println("INVALID NUMBER");
        }
        System.out.println(months[number-1]);
        System.out.println("---------------------");
//        System.out.println(months[0]);
//        System.out.println(months[1]);
//        System.out.println(months[2]);
//        System.out.println(months[3]);
//        System.out.println(months[4]);
//        System.out.println(months[5]);
//        System.out.println(months[6]);
//        System.out.println(months[7]);
//        System.out.println(months[8]);
//        System.out.println(months[9]);
//        System.out.println(months[10]);
//        System.out.println(months[11]);
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);

        }
        System.out.println("---------------------");

        for (int i = months.length-1; i >= 0; i--) { //i; represents the index numbers if array starting from last index
            System.out.println(months[i]);

        }

    }
}
