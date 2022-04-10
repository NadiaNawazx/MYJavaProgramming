package day15_ForLoops;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Nadia     ";

        boolean r = str.isEmpty();
        System.out.println(r);

        boolean r1 = str.isBlank();
        System.out.println(r1);

        System.out.println("__________________");

        String s1 = "CYDEO",
                s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        //EU will enter info in any format eg: yes,YES,Yes, YEs etc
        System.out.println("yeS".equals("YES"));
        System.out.println("yeS".equalsIgnoreCase("YES"));

        System.out.println("__________________");

        //.contains()
        String sentence = "My favourite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("__________________");

        String input1 = "I love Java";
        String input2 = "Java";
        System.out.println(input1.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2)); //false
        System.out.println(input1.contains("Java")); //true
        System.out.println(input1.toLowerCase().contains("java")); //true
        System.out.println(input1.toUpperCase().contains("JAVA")); //true

        System.out.println("__________________");

        String a = "Wooden Spoon";
        boolean a1 = a.startsWith("Wood");
        boolean a2 = a.endsWith("poon");
        boolean a3 = a.toLowerCase().startsWith("wooden"); //to ignore case sensitivity we first add upper/lower
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


    }
}
