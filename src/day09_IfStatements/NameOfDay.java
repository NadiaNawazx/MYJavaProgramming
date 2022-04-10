package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {

        int n = 5; // 1~7 days

        if (n == 1) {
            System.out.println("monday");
        }else if (n == 2) {
            System.out.println("tuesday");
        }else if (n == 3) {
            System.out.println("wednesday");
        }else if (n == 4) {
            System.out.println("thursday");
        }else if (n == 5) {
            System.out.println("friday");
        }else if (n == 6) {
            System.out.println("saturday");
        }else{
            System.out.println("sunday");
        }

        System.out.println("------------------------------------------------");

        String day = "day";

        if (n==1){
            day = "monday";
        }else if (n==2){
            day = "tuesday";
        }else if (n==3){
            day = "wednesday";
        }else if (n==4){
            day = "thursday";
        }else if (n==5){
            day = "friday";
        }else if (n==6){
            day = "saturday";
        }else if (n==7){
            day = "sunday";
        }

        System.out.println("Day = " + day);


    }
}


