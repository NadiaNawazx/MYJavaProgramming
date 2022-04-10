package day12_Scanner;

import java.util.Scanner;

public class HowManyPeopleLiveWithME {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How Many People Do You Live With?");
        int people = scan.nextInt();
        String result = "";

        if (people <= 3) {
            result = "Live with less than 3 people";
        } else if (people >= 3 && people <= 6) {
            result = "Live with 3 - 6 people";
        } else
            result = "Live with more than 6 people";

        System.out.println(result);
    }
}



