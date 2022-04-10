package day10_NestedIfAndTernaries;

public class DaysInWeek {
    public static void main(String[] args) {


        int n = 7; // 1~7 days
       String d1 = (n==1)? "monday":(n==2)? "tuesday":(n==3)? "wednesday"
               :(n==4)? "thursday":(n==5)? "friday":(n==6)? "saturday":"sunday";
       System.out.println(d1);




    }
}
