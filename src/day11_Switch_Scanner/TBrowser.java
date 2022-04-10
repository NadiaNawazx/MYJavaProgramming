package day11_Switch_Scanner;

public class TBrowser {
    public static void main(String[] args) {

        String nameBrowser = "firefox";
        switch (nameBrowser)

        {
            case ("chrome"):
                System.out.println("Chrome is the browsers name");
                break;
            case ("firefox"):
                System.out.println("firefox is the browsers name");
                break;
            case ("edge"):
                System.out.println("edge is the browsers name");
                break;
            case ("safari"):
                System.out.println("safari is the browsers name");
                break;
            case ("opera"):
                System.out.println("opera is the browsers name");
                break;
            case ("netflix"):
                System.out.println("netflix is the browsers name");
                break;
            default:
                System.out.println("INVALID BROWSER");


        }
    }
}
