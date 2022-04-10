package day15_ForLoops;

import java.sql.SQLOutput;

public class ForLoopPractices {
    public static void main(String[] args) {

        // 15 16 17 18 19 20 21 ... till 45
        for (int i = 15; i <= 45; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");

        System.out.println("----------------");
        // 100 99 98 97 96 95 94 93 92 91... 50.
        for (int i = 100; i >= 50; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("----------------");

        for (int i = 1; i <= 55; i++){
            if (i % 2 ==0){
                System.out.print(i+ " ");

            }
        }
        System.out.println();
        System.out.println("----------------");

        for (int i = 2; i <= 55; i += 2){
            System.out.print(i+" ");
        }

    }
}