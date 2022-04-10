package day23_CustomMethods_Voids;

public class MethodPractice2 {

    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println();
        helloCydeo5Times();
        System.out.println();
        evenNumbers();
        System.out.println();
        oddNumbers();

    }


    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");

        }

    }

    public static void helloCydeo5Times() {
        for (int j = 0; j < 5; j++) {
            System.out.println("Hello Cydeo!");

        }


    }

    public static void evenNumbers() {

        for (int i = 0; i < 11; i += 2) {
            System.out.print(i + " ");
        }


    }

    public static void oddNumbers(){

        for (int i = 0; i < 11; i++) {
            if (i%2!=0){
                System.out.print(i + " ");

            }
        }
    }


}

