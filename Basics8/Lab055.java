package src.Basics8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab055 {
    public static void main(String[] args) {
        List Fruits = List.of("Shekhar",true,123); //Collection Framework

        System.out.println(Fruits.get(2));
        System.out.println(Fruits.size());
        System.out.println(Fruits);
        System.out.println(Fruits.indexOf("Shekhar"));


        List mylist = new ArrayList(); // Cant use LIst as object name... need to give as array list

        mylist.add("Sh");
        mylist.add(1);
        mylist.add(true);


        System.out.println(mylist);
        mylist.set (0,"AM");              // Replace of SH with AM
        System.out.println(mylist);

        mylist.remove("AM");
        System.out.println(mylist);
        System.out.println(Fruits.indexOf(1));   // Ordering got changed after removing AM

        //Iterator iterator = mylist.iterator();
          //  while (iterator.hasNext()){
            //System.out.println(iterator.hasNext());
       // }      Infinite loop
    }
}
