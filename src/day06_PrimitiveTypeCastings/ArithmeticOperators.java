package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1); //121, concatenation

        System.out.println(10 + 20); //30, Addition
        System.out.println(100 - 50); //50, Subtraction
        System.out.println(10 * 6); //50, Multiplication

        System.out.println( 100.0 / 3 ); //33
        System.out.println(10.0/4 ); //2.5
        System.out.println(10/4.0 ); //2.5
        System.out.println(10d/4); //2.5

        int a = 100;
        double b = a/6; //16
        System.out.println(b);

        double c = a/6.0; //16.66666
        System.out.println(c);


        double c1 = (double) a/6; //16.66666
        System.out.println(c1);

        System.out.println( 100d );

    }
}

  /*
        +: Addition
        -: Subtract
        *: Multiplication
        /: Division

                integer / integer =======> integer
                decimal / integer =======> decimal
                integer / decimal =======> decimal
                decimal / decimal =======> decimal

                in math:
                    10/4 = 2.5
                    100/3 = 33.333....

                in java:
                    10/4 = 2
                    10.4/4 = 2.5
                    100/3 = 33

        %: Remainder/Modulus
         */