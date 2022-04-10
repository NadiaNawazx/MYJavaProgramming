package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the product name:");
        String product = scan.nextLine();

        System.out.println("Enter the price:");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity:");
        int quantity = scan.nextInt();

        System.out.println("Enter your name:");
        String firstName = scan.next();


        System.out.println(firstName+ ", your order for "+quantity+" "+product+" has been placed. Your total is "+price*quantity+ '.');

        scan.close();

    }
}
