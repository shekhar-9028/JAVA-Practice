package src.Basics6;

public class Lab051 extends BankAccounts {   // It should be same name with saved file
    public static void main(String[] args) {
        BankAccounts sbi = new BankAccounts();      // calling methods from other bankaccount.java file

        sbi.printDetails();     // it is calling default method or constructor
        System.out.println("______________________");

        BankAccounts hdfc = new BankAccounts("HDFC","HDFC001");  // this will call param const with 2 variables from other file
        hdfc.printDetails();
        System.out.println("______________________");

        BankAccounts icici = new BankAccounts("ICICI","ICICI001",10000);  // this will call parametric constructor with 3 variables from other file.
        icici.printDetails();

        LabRBI rbi = new BankAccounts("Union", "UNION005");
        ((BankAccounts) rbi).printDetails(); // calling from father class
        rbi.Print();// calling from grand parent

        LabRBI rbi2 = new LabRBI("PDCC", "PUNE");
        rbi2.Print();  //  calling from same class LabRBI

        BankAccounts ba1 = new BankAccounts("Gramin","Gramin12");
        ba1.Print();   // calling from grand parent class


    }

}
