package day05_Concatenation;

public class PhoneNumber {
    public static void main(String[] args) {
/*use string concatenation to display the phone number
            ex:
                if  countryCode = 1
                    areaCode = 703
                    localNumber = 4512625
            output:
                    +1(703)-4512625
          */
        String code = "+";
        int countryCode = 1;
        int areaCode = 703;
        int localNumber = 4512625;
        System.out.println(code+ countryCode+ "("+areaCode+ ")" + "-" +localNumber);


    }
}
