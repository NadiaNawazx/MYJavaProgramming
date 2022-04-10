package day37_Inheritance.PhoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("13 pro max", "7 inch", 1299.99, "Blue");

        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println("----------------------------------");

        iphone.call(98765);
        iphone.text(76543);
        iphone.facetime("yahoo@gmail.com");
        iphone.faceTime(3456789);
        System.out.println("--------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefence();

        System.out.println("-------------------------------------------------");

        System.out.println( Phone.hasBattery );
        System.out.println( iphone.hasBattery );
        System.out.println( Samsung.hasBattery );
        System.out.println( Nokia.hasBattery );


    }

}

