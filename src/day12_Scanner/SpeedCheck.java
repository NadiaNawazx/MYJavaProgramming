package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit = 55;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current speed:");
        int speed = scan.nextInt();

        if (speed <=55) {
            System.out.println("");
        }else
        System.out.println("YOU ARE DRIVING " + (speed - speedLimit) +"MPH OVER THE SPEED LIMIT !!! PLEASE SLOW DOWN !!!");


        scan.close();

    }
    }

