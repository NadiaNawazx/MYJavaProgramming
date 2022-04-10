package day24_CustomMethod_Return;

import jdk.swing.interop.SwingInterOpUtils;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("nadia", "nawaz");

        domain( "nadiamanha@gmail.com");

        String [] emails = {"nadia@gmail.com","nadia@yahoo.com","nadia@hotmail.com","nadia@outlook.com"};
        for (String email : emails) {
            domain(email);

        }
        nameOfTheMonths(12);
        nameOfTheDay(2);
    }

            //1. Create a method that can display the initials of the person
    public static void initials(String firstName, String lastName){

        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
        }

            //	2. Create a method that can display the domain of the email
    public static void domain(String email){

        String domain = email.substring( email.indexOf('@')+1 , email.lastIndexOf(".") );
        System.out.println("domain = " + domain);
    }

            //	3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfTheMonths(int number){

        String name ="";
        if (number >= 1 && number <= 12){
            name = (number == 1)? "Jan":(number == 2)? "Feb":(number == 3)? "March":(number == 4)? "April":(number == 5)? "May"
                    :(number == 6)? "June":(number == 7)? "July":(number == 8)? "Aug":(number == 9)? "Sep":(number == 10)? "Oct"
                    :(number == 11)? "Nov":"Dec";
        }else{
            System.err.println("INVALID");
        }
        System.out.println("name of the month = " + name);

    }

            //	4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfTheDay(int number){

        String name = "";

        if (number >= 1 && number <= 7){
            if (number == 1){
                System.out.println("Monday");
            }else if (number == 2){
                System.out.println("Tuesday");
            }else if (number == 3){
                System.out.println("Wednesday");
            }else if (number == 4){
                System.out.println("Thursday");
            }else if (number == 5){
                System.out.println("Friday");
            }else if (number == 6){
                System.out.println("Saturday");
            }else if (number == 7){
                System.out.println("Sunday");
        }else{
            System.err.println("INVALID");

        }

        }

            //	5. Create a method that can print how many days a month has


    }

            //	5. Create a method that can print how many days a month has
    public static void daysInAMonth(String month){




    }

}