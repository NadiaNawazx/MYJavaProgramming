package day10_NestedIfAndTernaries;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int s = 999;
        String s1 = (s >= 0 && s <= 100)? (s>=60)? "passed" :"failed" : "invalid";
        System.out.println(s1);







    }
}
