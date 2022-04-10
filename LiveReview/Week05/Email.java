package LiveReview.Week05;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid email: craig_fedridge@apple.com");
        String email = input.next();

        int indexof = email.indexOf("_");
        int indexAtSign = email.indexOf("@");
        int IndexOfDot = email.indexOf(".");




    }
}
