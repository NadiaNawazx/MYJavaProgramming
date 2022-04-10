package day14_StringMethod;

import day09_IfStatements.NameOfDay;

public class test {
    public static void main(String[] args) {
        
        String email = "nadia.nawaz@hotmail.com";
        String email2 = email.replace("hotmail","gmail");

        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", ""); //"Java Java   C# C# C++ C++"

        System.out.println("sentence2 = " + sentence2);

        sentence2= sentence2.replace("   ", " ");
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog Dog Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog","Cat");
        System.out.println("s = " + s);


        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace("C#","Java");
        System.out.println("s2 = " + s2);

        String s3 = "C# is fun, C# is cool";
        s3 = s3.replace(" C#"," Java");
        System.out.println("s3 = " + s3);

        System.out.println("-----------------------------------");

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";
        //result2 =result2.replaceFirst("C# ","Python ");
        //System.out.println("result2 = " + result2);
        String result3 = result2.replaceFirst(" C#"," Python");
        System.out.println("result3 = " + result3);

        String word2 = "Python C# Ruby";

        String s5 = word2.substring(0, word2.indexOf(" ")); //Java
        String s6 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" ")); //Programming
        String s7 = word2.substring(word2.lastIndexOf(" ")+1); //Language

        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);
        System.out.println("s7 = " + s7);

        System.out.println("-----------------------------------");


        String str = "Nadia";
        String str2 = str.repeat(10);
        System.out.println(str2);

        String s10 = "Wooden Spoon";
        String s11 = s10.repeat(100);
        System.out.println(s11);

        System.out.println("------------------------------------------");

        System.out.println("MANHA\n".repeat(100));

        System.out.println("------------------------------------------");

        String name = "Java";
        //System.out.println(name.repeat(20));
        System.out.println((name+" ").repeat(20));

        System.out.println("------------------------------------------");

        String str1 = "Nadia";
        str1 = str1.toUpperCase();
        System.out.println(str1);

        String str3 = "MANHA";
        str3 = str3.toLowerCase();
        System.out.println(str3);




    }
}
