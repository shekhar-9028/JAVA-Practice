package src.Basics8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Lab062 {
    public static void main(String[] args) {
        List<Integer> myMarks = new ArrayList<>();
        myMarks.add(91);
        myMarks.add(87);
        myMarks.add(80);
        Collections.sort(myMarks);   // Only used when only one datatype is there..

        System.out.println(myMarks);

        List<String> namelist = new ArrayList<>();
        namelist.add("Shekhar");
        namelist.add("Ambure");
        namelist.add("Saharsh");
        namelist.add("Vrushali");

        Collections.sort(namelist);
        System.out.println(namelist);

        ListIterator lt = namelist.listIterator(namelist.size());
        while(lt.hasPrevious()){
            System.out.println(lt.previous());
        }

        List random = new ArrayList();
        random.addAll(myMarks);
        random.addAll(namelist);
        System.out.println(random);

       //  Collections.sort(random);  will give class cast exception as string and int both added in random


    }

}
