package day16_ForLoopsStringsPractice;

import java.util.Scanner;

public class OscarUpperBound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Upperbound: ");
        int upperB = scan.nextInt();
        int total = 0;
        for (int i = 1; i <=upperB ; i++) {
            total+=i;
        } System.out.println(total);
        scan.close();

    }
}
