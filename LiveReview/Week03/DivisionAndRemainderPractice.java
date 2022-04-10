package LiveReview.Week03;

public class DivisionAndRemainderPractice {
    public static void main(String[] args) {

    int inputSeconds = 45000;
    int hours, min, seconds; //declared

        seconds = inputSeconds%60; // calculate remaining seconds
        min = (inputSeconds/60)%60;
        hours = inputSeconds / 3600;

        System.out.println("seconds = " + seconds);
        System.out.println("min = " + min);
        System.out.println("hours = " + hours);

    }
}
