package day25_CustomMethod_Overloading;

import utilities.StringUtility;
public class Testing_StringUtility<reverse> {
    public static void main(String[] args) {

        String str = "Java Programming Language";
        StringUtility.printEachChar(str);

        System.out.println("----------------");

        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("----------------");

        String word = "civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println(palindrome);

        System.out.println("----------------");

        String word1 = "aaaaabbbbbbcccccdddddeeeeffff";
        String nonDuplicates = StringUtility.removeDuplicates(word1);
        System.out.println(nonDuplicates);
    }
}

