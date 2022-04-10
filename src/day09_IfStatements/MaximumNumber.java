package day09_IfStatements;

public class MaximumNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 11;

        if (a > b) {
            System.out.println("A IS GREATER");
        } else {
            System.out.println("B IS GREATER");
        }
        System.out.println("------------------------------");
        int c = 21,
                d = 11;

        if (c < d) {
            System.out.println("C IS SMALLEST");
        } else {
            System.out.println("D IS SMALLEST");


            System.out.println("------------------------------");

            int Alcohol = 29;

            if (Alcohol >= 21) {
                System.out.println("YOU ARE ELIGIBLE TO BUY ALCOHOL");
            } else {
                System.out.println("YOU ARE NOT ELIGIBLE TO BUY ALCOHOL");
            }
            System.out.println("------------------------------");

            int canIVote = 12;

            if (canIVote >= 18) {
                System.out.println("I CAN VOTE");
            } else {
                System.out.println("I CAN NOT VOTE");
            }


        }
    }
    }
