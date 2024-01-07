package src.Basics6;

public class LabRBI {
   String bankname;
   String bankadd;

   LabRBI(){
       System.out.println("DC");
   }

   LabRBI(String BANKNAME, String BANKADD)
   {
       this.bankname= BANKNAME;
       this.bankadd = BANKADD;
   }
   void Print(){
        System.out.println("Bank name is "+ this.bankname);
        System.out.println("Bank Address is "+ this.bankadd);
    }
}
