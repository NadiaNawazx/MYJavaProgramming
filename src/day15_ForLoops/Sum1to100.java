package day15_ForLoops;

public class Sum1to100 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i; // += increment operator (sum += 5; sum = sum+5) sum = sum +1
            }
        }
                System.out.println("sum of even numbers = " +sum);

        System.out.println("----------------------");


        int sum2 = 0;
        for (int j = 0; j <= 100; j++) {
            if (j % 2 != 0) {
                sum2 += j; // += increment operator (sum += 5; sum = sum+5)
            }
        }
        System.out.println("sum of odd numbers = " +sum2);

    }
}
