package MyTesting;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LivesWithHowManyPeople {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("how many people do you live with? ");

        int people = scan.nextInt();
        String result = "";
        scan.close();

        if(people < 3){
            result = ("Lives with less then 3 people");
        }else if (people >= 3 && people <= 6){
            result = ("Lives with 3 - 6 people");
        }else{
            result = ("Live with more than 6 people");
        }
        System.out.println(result);

    }
}
/*1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */