package day09_IfStatements;

public class NameOfTheMonth {
    public static void main(String[] args) {

        int n = 1;
        String months = null;

        if(n==1){
            months = "jan";
        }else if(n==2){
            months = "feb";
        }else if(n==3) {
            months = "mar";
        }else if(n==4) {
            months = "apr";
        }else if(n==5) {
            months = "may";
        }else if(n==6) {
            months = "jun";
        }else if(n==7) {
            months = "jul";
        }else if(n==8) {
            months = "aug";
        }else if(n==9) {
            months = "sept";
        }else if(n==10) {
            months = "oct";
        }else if(n==11) {
            months = "nov";
        }else if(n==12) {
            months = "dec";
        }
        System.out.println("the month is = " + months);

    }
}
