package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        //assignment: =
        int number = 100;
        System.out.println("number = " + number); //100

        number = 200;
        System.out.println("number = " + number);


        String word = "Java Programming";
        System.out.println("word = " + word);


        word = "Wooden Spoon";
        System.out.println("word = " + word);


        word = "Cydeo";
        System.out.println("word = " + word);


        word = "Java Programming";
        System.out.println("word = " + word);



        System.out.println("------------------------------------");

        //Additional Assignment
        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x + 200); //300

        //x = x + 200;
        x +=200;
        System.out.println("x = " + x);

        x +=400;
        System.out.println("x = " + x);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);

        num1 +=5.5;
        System.out.println("num1 = " + num1);

        double availBalance = 1000.50;
        // deposit 300
        availBalance += 300;
        System.out.println("availBalance = " + availBalance);

        System.out.println("____________________________");

        // withdrawing 500;

        availBalance += 500;
        System.out.println("availBalance = " + availBalance);

        availBalance -=500; //availBalance = 1300.5 - 500;
        System.out.println("availBalance = " + availBalance);

        availBalance -= 200;
        availBalance += 400;
        System.out.println("availBalance = " + availBalance);


        System.out.println("____________________________");

        double salary = 50000.50;
        salary *= 2;
        System.out.println("salary = " + salary);

        double dodge = 0.00000001;
        dodge *= 1000000;
        System.out.println("dodge = " + dodge);


        System.out.println("____________________________");

        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("____________________________");

        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);

        System.out.println("____________________________");

        int amount = 127; //cents
        int quarters = amount /25;
        int cents = amount % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("____________________________");

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        System.out.println("____________________________");
        int y = 300;
        y %= 16;
        System.out.println("y = " + y);

        System.out.println("____________________________");

        int balance = 3500;
         // insurance fee: 153

        balance %= 153;
        System.out.println("balance = " + balance);






    }
}
