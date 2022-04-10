package day09_IfStatements;

import jdk.swing.interop.SwingInterOpUtils;

public class GradeReport {
    public static void main(String[] args) {

        int n = 100; //pass
        String grade;

        if (n==100) {
            grade = "A";
        } else if (n==80) {
            grade = "B";
        }else if (n==70) {
            grade = "C";
        }else if (n==60) {
            grade = "D";
        }else{
            grade = "E";
        }
        System.out.println("grade = " + grade);

    }
}
