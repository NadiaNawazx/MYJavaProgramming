package day09_IfStatements;

public class GradeReport2 {
    public static void main(String[] args) {

            int score = 75;
            String note;

            if (score >= 90) {
                note = "A";
            } else if (score >= 80) {
                note = "B";
            } else if (score >= 70) {
                note = "C";
            } else if (score >= 60) {
                note = "D";
            } else {
                note = "F";
            }
            System.out.println(note);
        }
    }
