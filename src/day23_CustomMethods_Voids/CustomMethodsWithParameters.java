package day23_CustomMethods_Voids;

import java.lang.reflect.Parameter;
import java.nio.file.attribute.UserDefinedFileAttributeView;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

   //     oddOrEven(); //method demands additional info to complete its task

        oddOrEven(41);
        ageOfPerson(1980);
        eligibleToVote(21, "usa");

    }

    public static void oddOrEven(int number){

        if (number % 2 == 0){
            System.out.println(number + " IS EVEN NUMBER");
        }else{
            System.out.println(number + " IS ODD NUMBER");
        }
    }

    public static void ageOfPerson (int birthYear){

        int age = 2022 - birthYear;
        System.out.println("You will be "+age+" years old in 2022!");
    }

    public static void eligibleToVote (int age, String citizen){

        if (age >= 18 && citizen.equalsIgnoreCase("USA")){
            System.out.println("YOU ARE Eligible to Vote");
        }else{
            System.err.println("YOU ARE NOT Eligible to Vote");
        }

    }



}

