package day02_HelloWorld;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;

public class test {
    public static void main(String[] args) {

        String str = "aaaaaaaabbbbbbbbb";

        str = ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);

        String name = "Java Programming";
        String reversedName = ReturnMethodIntro.reverse(name);
        System.out.println(reversedName);


    }
}
