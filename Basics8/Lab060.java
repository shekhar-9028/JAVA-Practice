package src.Basics8;

import java.util.Enumeration;
import java.util.Vector;

public class Lab060 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();   // Forcing datatype of String with diamond brace
        v.add("Shekhar");
        v.add("Ambure");
        System.out.println(v);
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
