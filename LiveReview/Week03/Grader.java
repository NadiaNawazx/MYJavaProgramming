package LiveReview.Week03;

import jdk.swing.interop.SwingInterOpUtils;

public class Grader {
    public static void main(String[] args) {
        
        int score = 12;

        if(score>=90){
            System.out.println("excellent");
        }else if(score>=80){
            System.out.println("Good");
        }else if (score>=70){
            System.out.println("average");
        }else{
            System.out.println("FAILURE");
        }

        System.out.println(" -------------------------------- ");

        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2;
        System.out.println(res);




    }
}
