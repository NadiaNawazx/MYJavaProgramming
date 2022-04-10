package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "JAVAJAVAJAVA";
        int freq = 0;
        for (int i = 0; i <= str.length()-4; i++) { //0,1,2,3
            String eachSub = str.substring(i, i+4);
           // System.out.println("eachSub = " + eachSub);
            if (eachSub.equalsIgnoreCase("JAVA")){
                freq++;
            }
        }
        System.out.println("freq = " + freq);

    }
    }

/*
	2. write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3
 */