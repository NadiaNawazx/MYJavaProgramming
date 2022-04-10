package day10_NestedIfAndTernaries;

public class NameOfTheMonth {

    public static void main(String[] args) {
        int num = 12;
        String result = "" ; // temporary

        if(num>= 1 && num <= 12){ //if the num is valid (1~12)

            if(num == 1){
                result = "January";
            }else if(num == 2){
                result = "February";
            }else if(num == 3){
                result ="March";
            }else if(num == 4){
                result ="April";
            }else if(num == 5){
                result ="May";
            }else if(num == 6){
                result ="June";
            }else if(num == 7){
                result ="July";
            }else if(num == 8){
                result ="August";
            }else if(num == 9){
                result ="September";
            }else if(num == 10){
                result ="October";
            }else if(num == 11){
                result ="November";
            }else{
                result = "December";
            }

        }else{ //if the num is not valid
            result = "Invalid num";
        }


        System.out.println(result);


    }
}