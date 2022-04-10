package day10_NestedIfAndTernaries;

public class TernariesIntros {

    public static void main(String[] args) {

        int n =12;

        if (n%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        System.out.println("___________________________");

        String s = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(s);

        System.out.println("___________________________");

        int age = 10;
        String s1 = (age >= 21) ? "Eligible" : "NOT Eligible";
        System.out.println(s1);

        System.out.println("___________________________");

        int number = 0;
        String s2 = (number > 0) ? "positive" : (number < 0) ? "negative" : "Zero";
        System.out.println(s2);

    }
}
