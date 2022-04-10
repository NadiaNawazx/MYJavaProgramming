package day19_LoopsPractices;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = ""; //a2b1c3d1

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i); // 'a'

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j); // representing each character of the str
                if (ch == each) {
                    count++;}

            }
                if (result.contains("" + ch)) {
                    continue;
                }
                result += ch;
                result += count;
            }
            System.out.println(result);
        }
    }

/*
Tasks:
	1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */
