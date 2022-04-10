package day37_Inheritance.PhoneTask;

public class IPhone extends Phone{

    public IPhone(String model, String size, double price, String colour) {
        super("Apple", model, size, price, colour);
    }


    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is Facetiming with phone number: " + phoneNumber);
    }

    public void facetime(String email){
        System.out.println(brand+" "+model+" "+ " is facetiming with email "+email);
    }


}
/*
 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */