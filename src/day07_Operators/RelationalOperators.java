package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // >, >=, <, <=

        boolean result1 = 20 > 40; //true
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150;
        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;
        System.out.println("result3 = " + result3);

        boolean result4 = 100 >= 200;
        System.out.println("result4 = " + result4);

        boolean result55 = 100 < 200;
        System.out.println("result55 = " + result55);

        // credit score of 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720; // >= is the credit score is 720 or greater, then you are eligible for a loan
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result5 = 100 < 120; // true
        System.out.println("result5 = " + result5);

        boolean result6 = 100 <= 120; // true
        System.out.println("result6 = " + result6);

        int score = 59;
        boolean hasFailed = score <= 59;
        // TRUE - has failed as score is less or equal to 59
        System.out.println("hasFailed = " + hasFailed);


        System.out.println("------------------");


        boolean result7 = 29 == 99;
        System.out.println("result7 = " + result7);

        int x = 100;
        int y = 200;
        boolean equal = x==y; // false
        //            = 100 == 200
        System.out.println("equal = " + equal);
        
        boolean result8 = "muhtar" == "Good Guy"; //false
        System.out.println("result8 = " + result8);

        boolean result9 = "A" == "a"; //false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; //true
        System.out.println("result10 = " + result10);


        System.out.println("------------------");

        boolean result11 = 100 != 200; //true
        System.out.println("result11 = " + result11);

        System.out.println("------------------");











    }
}
