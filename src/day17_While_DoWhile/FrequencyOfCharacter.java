package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "BOOOOZOOOOOB";

        char ch = 'B';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) { //i: indexes of str
            char eachChar = str.charAt(i); // eachChar: each character of str

            if (ch == eachChar) { // if given ch is matching with the eachChar, then ch is appeared n the string
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);
    }
}
//warmup tasks:
//	1.  Write a program that can return the frequency
//	    of a char from a String
//
//			Ex:
//				str = "AAABBBC"
//				ch = 'A'
//
//			Output:
//				3