package day12_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many total shares do you have:");
        int totalShares = scan.nextInt();

        String result = "Invalid Number of shares";

        if (totalShares > 0) {
        System.out.println("how much is your total value in the stock market:");
        double totalValue = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter the name of the company they have the most shares in:");
        String company = scan.nextLine();

            result = "Your total stock market holding is $" + totalValue + " which is made up of " + totalShares + " shares." + company + " is your company holdings.";

            System.out.println(result);

            scan.close();


        }


    }
}
