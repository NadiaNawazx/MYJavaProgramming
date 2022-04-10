package day36_Inheritance.encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Nadia", 41, 'F', 'A', "Cydeo");
        student1.setAge(40);
        System.out.println(student1);
    }
}
