package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {

        int year = 2021;
        String make ="Audi";
        String model = "A4";
        int miles = 23500;
        String colour = "Black";
        double price = 19.999;

        //System.out.println(year+ " " + make+ " " + model+ ", " + miles+ " miles, " + colour+ ", $" + price);
String carInfo = year+ " " + make+ " " + model+ ", " + miles+ " miles, " + colour+ ", $" + price;
        System.out.println(carInfo);
    }
}
