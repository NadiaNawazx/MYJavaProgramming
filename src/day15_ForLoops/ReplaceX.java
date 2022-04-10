package day15_ForLoops;

public class ReplaceX {
    public static void main(String[] args) {
        System.out.println("Replace the word X:");
        String str = "xxxXXXXx";

        str = str.replace("x", "a").replace("X","a");
        // "codeX"

        System.out.println(str);
    }
}
