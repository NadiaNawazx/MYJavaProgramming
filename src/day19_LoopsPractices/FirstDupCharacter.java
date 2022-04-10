package day19_LoopsPractices;

public class FirstDupCharacter {
    public static void main(String[] args) {

        String str = "abbbcccddff";

        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = 0 ;
            for (int j = 0; j < str.length(); j++) {
                char each=str.charAt(j);

                if (c==each) {
                    count++;
                }
            }
            if (count%2==0){
                result+=c;
                break;
            }

        }

        System.out.println(result);

    }
}
//	1. Write a program that can return-
//            the first duplicated character from a string
