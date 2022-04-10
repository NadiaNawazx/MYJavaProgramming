package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        int maximumNumber = max(121, 123);

        System.out.println(maximumNumber);

        int multiply = maximumNumber * 2;
        System.out.println(multiply);
    }

    public static int max(int a, int b){

        //find the max number between 100~200
        int result = 0;
        if (a > b){
            result = a;
        }else{
            result = b;
        }
        return result;
    }



}
