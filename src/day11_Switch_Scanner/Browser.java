package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName = "Opera";
        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "Opera"
                ||browserName == "firefox"
                ||browserName == "safari" || browserName == "edge";

        if(validBrowser){

            if(browserName == "chrome") {
                result = "Chrome Browser is selected";
            }else if(browserName == "firefox") {
                result = "Firefox Browser is selected";
            }else if(browserName == "Opera"){
                result = "Opera Browser is selected";
            }else if(browserName == "Safari"){
                result = "Safari Browser is selected";
            }else if(browserName == "Edge"){
                result = "Edge Browser is selected";
            }
            }else{
            result = "Invalid Browser Name";
        }
        System.out.println(result);








    }
}
