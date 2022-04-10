package day24_CustomMethod_Return;

public class Return_Vs_ExitMethod {
    public static void main(String[] args) {


    }

    public static void nameOfTheMonths(int number){

        if (number<1 || number >12){
            System.err.println("invalid");
            return; // exits nameOfTheMonths method
        }

        String name = (number == 1)? "Jan":(number == 2)? "Feb":(number == 3)? "March":(number == 4)? "April":(number == 5)? "May"
                :(number == 6)? "June":(number == 7)? "July":(number == 8)? "Aug":(number == 9)? "Sept":(number == 10)? "Oct"
                :(number == 11)? "Nov":"Dec";

        System.out.println("name of the month = " + name);

    }
}
