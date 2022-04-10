package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = sc.nextLine();

        System.out.println("Enter your building number:");
        int building = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your street name:");
        String streetName = sc.nextLine();

        System.out.println("Enter your city name:");
        String cityName = sc.nextLine();

        System.out.println("Enter your state:");
        String state = sc.next();

        sc.nextLine();

        System.out.println("Enter your zip code:");
        String zipCode = sc.next();

        sc.nextLine();

        System.out.println("Enter your country name:");
        String countryName = sc.nextLine();



        System.out.println("Full name:" + fullName);
        System.out.println("Building number:" + building);
        System.out.println("Street name:" + streetName);
        System.out.println("City name:" + cityName);
        System.out.println("State name:" + state);
        System.out.println("Zip Code :" + zipCode);
        System.out.println("Country name:" + countryName);

        System.out.println(fullName+"\n" + building+" " + streetName+" " + cityName+"\n" + state +", " + zipCode+"\n" +countryName);

sc.close();

    }
}
