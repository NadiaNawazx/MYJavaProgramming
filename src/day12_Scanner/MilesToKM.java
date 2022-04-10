package day12_Scanner;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Miles:");
        double miles = scan.nextDouble();
        double km = miles*1.609344;

        System.out.println(miles+ " miles equals to " +km+ " kilometers");

scan.close();

    }
}
