package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {

        char grade = 'A';
        String result = "";

        switch (grade){

            case 'A':
                result = ("Excellent");
                break;
            case 'B':
                result = ("GREAT JOB");
                 break;
            case 'C':
                result = ("GOOD");
                break;
            case 'D':
                result = ("PASSED");
                break;
            case 'E':
                result = ("FAILED");
                break;
            default:
                result = ("INVALID");

        }

    }

}

/*
3. a char variable named grade is given.
use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
 */