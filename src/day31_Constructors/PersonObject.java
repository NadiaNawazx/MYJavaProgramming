package day31_Constructors;

import day31_Constructors.Person;

public class PersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("john", 'M', 21);
        Person person2 = new Person("jack", 'M', 35);
        Person person3 = new Person("Nadia", 'F', 41);

        person1.age = 30;


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}
