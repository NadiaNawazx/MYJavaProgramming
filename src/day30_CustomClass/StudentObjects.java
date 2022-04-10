package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Nadia", 'F', 41, 98765999, 'A');

        Student student2 = new Student();
        student2.setInfo("Manha", 'F', 4, 998798, 'B');

        Student student3 = new Student();
        student3.setInfo("Saif", 'M', 27, 994297, 'C');

        Student student4 = new Student();
        student4.setInfo("Aadam", 'M', 19, 56757, 'B');

        Student student5 = new Student();
        student5.setInfo("Hisam", 'M', 17, 454543, 'A');

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); //grade A
        ArrayList<Student> angryBirds = new ArrayList<>(); //grade B,C,D,E,F

        for (Student student : students) {
            if (student.grade == 'A') {
                earlyBirds.add(student);
            } else {
                angryBirds.add(student);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

    }
}


