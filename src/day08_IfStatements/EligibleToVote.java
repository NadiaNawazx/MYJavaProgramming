package day08_IfStatements;

public class EligibleToVote {


    public static void main(String[] args) {

       /* String name = "josh";
        int age = 38;
        String country = "USA";

        boolean isEligible = age >= 21 && country == "USA";//True

        //Eligible
        if (isEligible) {// True
            System.out.println("Eligible");
        }
        //Not Eligible
        if (!isEligible) {// !True ==> not true==> false
            System.out.println("Not Eligible");
        }

        System.out.println("----------------------");

        int age1 = 44;
        if (age1 > 40) {
            System.out.println("TRUE");
        } else if ((age1 < 40)) {
            System.out.println("FALSE");
        }

*/

        System.out.println("----------------------");

        int overForty = 99;
        System.out.println(overForty>40);



        System.out.println("----------------------");

        int day = 7;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
// Outputs "Looking forward to the Weekend"

    }
}


