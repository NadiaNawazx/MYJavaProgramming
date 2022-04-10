package day19_LoopsPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i==3){
                // break; // break the loop
                // continue; // terminates the current loop
                System.exit(0); // terminates the program
            }
            System.out.print(i+" ");

        }
        System.out.println("Wooden Spoon");
    }
}
