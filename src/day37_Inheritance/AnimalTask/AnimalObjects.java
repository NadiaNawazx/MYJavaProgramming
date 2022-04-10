package day37_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Jaz", "Poodle", 'F', 3, "Small", "Pink");
        System.out.println(dog1);

        dog1.bark();

        Cat cat1 = new Cat("Muzzy", "British Blue", 'M', 2, "Medium", "Grey");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("Birdie", "African", 'M', 1, "Medium", "Blue");
        System.out.println(parrot1);
        parrot1.sing();



    }

}
