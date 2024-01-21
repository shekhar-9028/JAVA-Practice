package src.Basics8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab059 {
    public static void main(String[] args) {
        List ttacourseList = new ArrayList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add("Java for Testers");


       ListIterator lt= ttacourseList.listIterator();
       while(lt.hasNext()){
           System.out.println(lt.next());
       }


        System.out.println(" --- ");


   ListIterator lt2 = ttacourseList.listIterator(ttacourseList.size());
        while (lt2.hasPrevious()) {   // For reverse order
        //    ttacourseList.add("Gen AI");  it is not advised to add any new course during iteator use.
          //  lt2.add("Gen AI");            it is not advised to add any new course during iteator use
            System.out.println(lt2.previous());
        }

    }
}
