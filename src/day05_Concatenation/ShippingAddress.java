package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
/*
String  1. name
String  2. buildingNumber
String  3. streetName
String  4. city
String  5. state
String  6. zipCode
 */

        String name ="Nadia Nawaz",
                buildingNumber = "241",
                streetName = "Arthurs Road",
                city = "Coventry",
                state = "England",
                zipCode = "B11 2AP";

        // System.out.println(name + "\n" + buildingNumber + " " +streetName + "\n" + city + ", " + state + " " + zipCode);\

        String address = name + "\n" + buildingNumber + " " +streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(address);
    }
}
