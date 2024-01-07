package src.Basics6;

public class BankAccounts extends LabRBI {
    int balance;
    String bankName;
    String temp;
    String bankCode;

    BankAccounts() {
        System.out.println("I am default constructor");
    }

    BankAccounts(String name, String bcode) {
        System.out.println("I am Parametrized constructor");
        this.bankName = name;
        this.bankCode = bcode;


    }

    BankAccounts(String name, String bcode, int balance) {
        System.out.println("I am Parametrized constructor");
        this.bankName = name;
        this.bankCode = bcode;
        this.balance = balance;

    }

    public void printDetails() {
        System.out.println("BankName --> " + this.bankName);
        System.out.println("BankCode --> " + this.bankCode);
        System.out.println("BankCode --> " + this.balance);
        temp = this.bankCode;
        System.out.println("BankCode --> " + temp);
    }


}