package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        /*
        Unary Operators:
	++: increase the value by 1.
	-- : decreases the value by 1.

	Post vs Pre:
		Pre : changes the value immediately
				++ a
				-- a

		post: changes the value in the second step.
				a ++
				a --

         */

        int a = 5;
        System.out.println(++a); // =6 PRE INCREMENT >>> adds 1
        System.out.println(--a); // =5 PRE DECREMENT >>> subtracts 1

        System.out.println("----------------------------------------------");

        int b = 100;
        System.out.println(b++); // =100 POST INCREMENT >>> ADD NUMBER AFTER THE VALUE
        System.out.println(b); // =101

        System.out.println("----------------------------------------------");

        int x = 200;

        System.out.println(--x); // =199 PRE INCREMENT - DECREASES THE VALUE

        int y = 200;

        System.out.println(y--); // =200  POST DECREMENT

        System.out.println("----------------------------------------------");

        int z  =  45;
        // POST
        System.out.println( ++z );
        System.out.println( z++ );
        System.out.println( z );

        System.out.println("----------------------------------------------");

        int q = 30;
        // PRE
        System.out.println(--q); // 29
        System.out.println(q--); // 29
        System.out.println(q); // 28



    }
}
