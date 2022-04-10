package LiveReview.Week03;
 import java.util.Scanner;
    public class equalNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter 3 numbers");
            int n1 = scanner.nextInt(), n2 = scanner.nextInt(), n3 = scanner.nextInt();

            String result = "";
            if (n1 == n2 && n1 == n3)
                result = "all equal";
            else if (n1 == n2) {
                result = "n1&n2 are equal";
            } else if (n2 == n3) {
                result = "n2&n3 are equal";
            } else if (n1 == n3) {
                result = "n1&n3 are equal";
            } else {
                result = "none are equal";
            }
            System.out.println(result);

            System.out.println("___________-");


            String s = (n1 == n2 && n1 == n3) ? "all equal" : (n1 == n2) ? "n1&n2 are equal" : (n2 == n3) ? "n2&n3 are equal" : (n1 == n3) ? "n1&n3 are equal" : "none are equal";
            System.out.println( s );


        }
    }
