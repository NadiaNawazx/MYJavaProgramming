package day15_ForLoops;

public class Alphabet {
    public static void main(String[] args) {

        for (char alphabet = 'a';alphabet <= 'z'; alphabet ++ ){
            System.out.print(alphabet+ " ");
        }
        System.out.println();
        System.out.println("-----------------------");

        for (char alpha2 = 'A'; alpha2 <= 'Z'; alpha2++){
            System.out.print(alpha2+" ");
        }
        System.out.println();
        System.out.println("-----------------------");

        for (char alpha2 = 'Z';alpha2 >= 'A';alpha2-- ){
            System.out.print(alpha2+" ");
        }
        System.out.println();
        System.out.println("-----------------------");

        for (char alpha3 = 'z';alpha3 >= 'a'; alpha3-- ){
            System.out.print(alpha3+" ");
        }
        System.out.println();
        System.out.println("-----------------------");

        for (char i = 1; i <= 40000; i ++){
            System.out.print(i);
        }

    }
}
