package day12_Scanner;

import MyTesting.IfElseStatement;

import java.util.Scanner;

public class TaskGradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you're score:");
        String grade = "";
        int score = scan.nextInt();

        if (score >= 0 && score <= 100) {

        }
    }
}

/*
2. GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */