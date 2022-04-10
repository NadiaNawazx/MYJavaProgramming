package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Kaya";
        dog1.breed = "Maltese";
        dog1.age = 2;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.colour = "White";

        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 3;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.colour = "Grey";


        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 4, 'M', "Large", "Black");

        Dog dog4 = new Dog();
        dog4.setInfo("John", "poodle", 1, 'F', "Small", "Pink");

        Dog dog5 = new Dog();
        dog5.setInfo("James", "Spanial", 7, 'M', "Large", "Brown");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.play();
        dog3.bark();

        System.out.println("-------------------------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        femaleDogs.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5));
        ArrayList<Dog> maleDogs = new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5));

        for (Dog each : femaleDogs) {
            System.out.println(each.name + " : " + each.gender);
        }
        for (Dog each : maleDogs) {


        }
    }
}
