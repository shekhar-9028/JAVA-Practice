package src.Basics8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab064 {
    public static void main(String[] args) {
        List<Integer> myMarks = new ArrayList<>();
        myMarks.add(91);
        myMarks.add(87);
        myMarks.add(80);
        Collections.sort(myMarks);
        System.out.println(myMarks);

        Student st1 = new Student(1,"Shekhar");
        Student st2 = new Student(5,"Saharsh");
        Student st3 = new Student(5,"Vrushali");

        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
