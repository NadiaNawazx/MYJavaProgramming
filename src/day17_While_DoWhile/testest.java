package day17_While_DoWhile;

import java.util.Scanner;

public class testest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // your code
        // ------------------------------------------
        String request = "Please enter guest name:";
        String guestList = "";
        String guestName ;
        boolean referance = true;

        while(referance){
            System.out.println(request);
            guestName = scan.next();

            System.out.println("Do you want to enter new guest name:");
            String answer = scan.next();

            if (answer.equals("no")){
                guestList += guestName ;
                System.out.println("Guest's list: " + guestList);
                System.exit(0);
            }else{
                guestList += guestName + ", ";
            }
        }
    }

}
