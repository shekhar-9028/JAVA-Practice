package src.Basics8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab056 {
    public static void main(String[] args) {
        List<String> courselist = new ArrayList<>();
        courselist.add("Shekhar");
        courselist.add(1,"Ambure");
        courselist.add ("Saharsh");

        List rupeelist = new ArrayList();
        rupeelist.add(23);
        rupeelist.add(54);
        rupeelist.add(98);

        courselist.addAll(rupeelist);

        System.out.println(courselist);

        Iterator it = courselist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
