package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {

        String str1 = grade(99);
        if (str1.equals("A")){
            System.out.println("Excellent");
        }else if (str1.equals("B")){
            System.out.println("GREAT");
        }else if (str1.equals("C")){
            System.out.println("GOOD");
        }else if (str1.equals("D")){
            System.out.println("PASSED");
        }else {
            System.out.println("TRY AGAIN");

        }
    }


    public static String grade (int score) {

        String result = "";

        if (score < 0 || score > 100){
            result = "Invalid";
        }else{
            result = (score >= 90) ? "A" :(score >= 80) ? "B" :(score >= 70) ? "C"
                    :(score >= 60) ? "D" :(score >= 50) ? "E" : "F";
        }
        return result;
    }
}


