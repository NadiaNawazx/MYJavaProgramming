package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python Python";
        int frequency = 0;
        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println("frequency = " + frequency);

        System.out.println("----------------------------------");

        String sentence = "cat cat cat cat dog dog dog cat cat";
        sentence = sentence.toLowerCase();
        int countCat = 0;
        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println("countCat = " + countCat);

        System.out.println("----------------------------------");

            String s = "java java java python python python";
            int countJ = 0;
            int countP = 0;

            while (s.contains("java") || s.contains("python")) {
                if (s.contains("java")) {
                    s = s.replaceFirst("java", "");
                    countJ++;
                }
                if (s.contains("python")) {
                    s = s.replaceFirst("python", "");
                    countP++;
                }
            }
            System.out.println("containsP = " + countP);
            System.out.println("containsJ = " + countJ);
        }
    }
