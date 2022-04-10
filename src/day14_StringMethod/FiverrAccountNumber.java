package day14_StringMethod;

import java.util.Scanner;

public class FiverrAccountNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Account Number:");
        String account = scan.nextLine();
        scan.close();

        String valid = "Your Account Valid, you are now logged in!";
        String invalid = "INVALID, YOUR ACCOUNT IS LOCKED!";

        if (account.startsWith("2") && account.length() == 7){
                System.out.println(valid);
            }else if (account.startsWith("5") && account.length() == 10){
                System.out.println(valid);
        }else{
            System.out.println(invalid);
        }


    }
}

/*
    6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */