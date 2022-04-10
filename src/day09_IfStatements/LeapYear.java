package day09_IfStatements;

import jdk.swing.interop.SwingInterOpUtils;

public class LeapYear {
    public static void main(String[] args) {

        int year = 1980;

        boolean leapYear = year%4 == 0;
        if (leapYear){
            System.out.println(year+ " is a leap year.");
        }else{
            System.out.println(year+ " is NOT leap year.");
        }



    }
}
