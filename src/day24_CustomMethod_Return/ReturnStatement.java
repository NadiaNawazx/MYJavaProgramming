package day24_CustomMethod_Return;

public class ReturnStatement {

    public static void main(String[] args) {

        nameOfTheDay(8);

    }

    //	4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfTheDay(int number) {

        if (number < 1 || number > 7) {
            System.err.println("Invalid");
            return;
        }

        if (number == 1) {
            System.out.println("Mon");
        } else if (number == 2) {
            System.out.println("Tues");
        } else if (number == 3) {
            System.out.println("Wed");
        } else if (number == 4) {
            System.out.println("Thurs");
        } else if (number == 5) {
            System.out.println("Fri");
        } else if (number == 6) {
            System.out.println("Sat");
        } else {
            System.out.println("Sun");

        }
    }



}
