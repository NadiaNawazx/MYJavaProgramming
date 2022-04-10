package day19_LoopsPractices;

public class IndexNumOfFirstUniqueChar {
    public static void main(String[] args) {

        String entry = "aabcccdef";

        for (int j = 0; j < entry.length(); j++) {
            char ch = entry.charAt(j);
            int count = 0;
            for (int i = 0; i < entry.length(); i++) {
                if (entry.charAt(i) == ch) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Index number of first unique character is: " + entry.indexOf(ch));
                System.exit(0);
            }
        }

    }

}