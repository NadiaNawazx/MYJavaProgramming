package day17_While_DoWhile;

public class test {
    public static void main(String[] args) {



        int a = 0;
        do {
            a = a++ + --a - (a % 3);
        } while ( ++a < 4);
        System.out.println(a);

        System.out.println("------------");


        String str = "The whole time it was raining.";

        do {
            System.out.print(str.charAt(0));
            str = str.substring(3);
        } while (!str.isEmpty());

        System.out.println("------------");



    }
}
