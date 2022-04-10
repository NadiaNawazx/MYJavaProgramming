package day15_ForLoops;

public class FiverrPalindrone {

    public static void main(String[] args) {

        String str = "level";

        String reverse = "";

        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i)+reverse;
        }

        if (reverse.equalsIgnoreCase(str)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }



    }
}
