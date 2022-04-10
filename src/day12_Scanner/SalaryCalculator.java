package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("****Salary Calculator****");

        System.out.println("Enter your hourly rate:");
        double hourlyRate = scan.nextDouble();

        System.out.println("Enter how many hours you work in a week:");
        int hoursWeek = scan.nextInt();

        System.out.println("Enter how much state tax you pay in %:");
        double stateTaxRate = scan.nextDouble() / 100;

        System.out.println("Enter how much federal tax you pay in %");
        double fedTaxRate = scan.nextDouble() / 100;

        scan.close();

        double salary = hourlyRate * hoursWeek * 52;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * fedTaxRate;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);


    }
}
