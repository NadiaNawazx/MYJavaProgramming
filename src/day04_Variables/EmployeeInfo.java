package day04_Variables;

import javax.swing.*;

public class EmployeeInfo {
    public static void main(String[] args) {
        /* EmployeeInfo. declare the following variables:
				1.  (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yearsOfExperience (double)
				7. salary (int)
				8. isFullTime (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)
         */
        String employeeName = "Manha";
        int age = 4;
        char gender = 'F';
        String company = "Wates Group Limited";
        String jobTitle = "Desktop Support Engineer";
        double yearsOfExperience = 5.9;
        int salary = 50000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeID = "AB123456";
        String SSN = "EE67890";

        System.out.println(" employeeName = " + employeeName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("salary = " + salary);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeID = " + employeeID);
        System.out.println("SSN = " + SSN);


    }
}
