package day37_Inheritance.PhoneTask;

public class Samsung extends Phone{

    public Samsung(String model, String size, double price, String colour) {
        super("Samsung", model, size, price, colour);
    }

    public void freeze(){
        System.out.println(brand+" "+model+" phones tend to always freeze.");
    }
}
/*
Create a subclass of Phone named Samsung:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    freeze()
                    toString()
 */