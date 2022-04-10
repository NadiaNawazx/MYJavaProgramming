package day32_Constructors;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Audi");
        Car car2 = new Car("VW", "Golf");
        Car car3 = new Car("Merc", "Benz", 2020);
        Car car4 = new Car("Lexus", "Dido", 2022, 39999);
        Car car5 = new Car("BMW", "M3", 2021, 69999, "Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);






    }
}
