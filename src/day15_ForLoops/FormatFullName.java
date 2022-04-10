package day15_ForLoops;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName = "MANHA",
                lastName = "ZANIB";

//        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
//        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        firstName = ("" + firstName.charAt(0) ).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = ("" + lastName.charAt(0) ).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName);
        System.out.println(lastName);

        String fullName = firstName +" "+ lastName;

        System.out.println("Full name = " + fullName);

    }
}
