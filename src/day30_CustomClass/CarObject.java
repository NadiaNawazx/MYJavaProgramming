package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Audi", "A3", "black", 2022, 59999);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("BMW", "M3", "Silver", 2023, 49999);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Mercedes", "A Class", "White", 2021, 69999);
        System.out.println(car3);

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carsList){
            System.out.println(each.brand+" : "+each.price);
        }
        for (Car each : carsList){
            System.out.println(each.brand+" : "+each.model);
        }

        carsList.removeIf(p-> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf(p-> p.brand.equals("Mercedes") && p.year >= 1995 && p.year <- 1997);



        System.out.println("-----------------------------------");





    }
}
