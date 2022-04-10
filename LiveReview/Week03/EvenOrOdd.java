package LiveReview.Week03;

public class EvenOrOdd {
    public static void main(String[] args) {

        int a = 21;
        if (a%2==0){
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }

        System.out.println("------------------");
int number = 6;
        if (number%2==0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }

        System.out.println("------------------");

int num = 2;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("result = " + result);
    }
}
