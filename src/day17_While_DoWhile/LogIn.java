package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Username: ");
        String u = scan.next();

        System.out.println("Enter your Password: ");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) { // if the condition is valid
            System.out.println("Login successful");
        } else {
            int attempt = 3; // the user has 3 attempts at logging in.
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempt > 0) {
                if (attempt == 1){
                    System.out.println("THIS IS YOUR LAST ATTEMPT");
                }
                System.err.println("*** Incorrect username or password, please re-enter ***");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();
                attempt--;
            }
            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("Login successful");
            } else {
                System.out.println("Your account is locked");

            }
scan.close();

        }
    }


}