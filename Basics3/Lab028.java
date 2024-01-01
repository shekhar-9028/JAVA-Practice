package src.Basics3;

import java.util.Scanner;

public class Lab028 {
    public static void main(String[] args) {
        for(int i=1; i<=10;i++)                // Or i=0 ; i<10 ; i++
        {
            System.out.println("Shekhar");
        }

        //Infine loop
       // final boolean b1 = true;
        //b1=false;
       // for (float f = 0; b1; )
           // System.out.println("TTA");
        for (double i = 1.1; i < 12.30; i++) {
            System.out.println("Hi");

            // Print the Odd number in between the 1 to 50.
            // If Else
            for (int i1 = 0; i1<=50; ++i1) {
                if(i1%2==0){ // !(i%2==1) OR (i%2==0)
                    System.out.println(i+ " is Even!");
                }
            }
            System.out.println(" --- End of Program!! --- ");

            Scanner sc = new Scanner (System.in);
            int i3 = sc.nextInt();
            while(true) { // There is no Exit Condition
                System.out.println("TTA");
            }

            // !(i%2==1) OR (i%2==0)

    }}

}
