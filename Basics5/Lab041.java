package src.Basics5;

import javax.management.ImmutableDescriptor;

public class Lab041 {
    public static void main(String[] args) {
        String str1= "Shekhar";       /*it will be stored in String Content Pool'*/
        String str2 = new String("Shekhar");

        System.out.println(str1==str2);   /* it will compare location and str2 is created in object area' */
        System.out.println(str1.equals(str2)); /* it will compare actual content' */

        // Immutable strings
        String str3= "Shekhar";       /*it will be stored in String Content Pool'*/
        String str4 = new String("Shekhar");

 // Mutable string   : Editable
 StringBuilder str5 = new StringBuilder("Saharsh");
 str5.append("Ambure");
        System.out.println(str5);


    }
}
