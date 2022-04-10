package day16_ForLoopsStringsPractice;

public class fiverrFreqOfDogAndCat {

    public static void main(String[] args) {

        String str = "caT dog dogG cAt";
        int countDog = 0;
        int countCat = 0;

        for (int i = 0; i <= str.length() - 3; i++) {

            String search = str.substring(i, i + 3);
            if (search.equalsIgnoreCase("dog")) {
                countDog++;
            }
            if (search.equalsIgnoreCase("cat")) {
                countCat++;
            }

        }
        boolean result = countCat == countDog;
        System.out.println(result);
    }
}

