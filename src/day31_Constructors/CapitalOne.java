package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Nadia Nawaz", 1234567890);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(900);
        account1.checkBalance();
        account1.deposit(900);
        account1.checkBalance();


        System.out.println("-----------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Manha Zanib", 87654321);
        System.out.println(account2);

        account2.deposit(2000000);
        account2.checkBalance();
        account2.withdraw(30000);
        account2.checkBalance();















    }
}
