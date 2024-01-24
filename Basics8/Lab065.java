package src.Basics8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab065 {
    public static void main(String[] args) {

        Rupee rs1 = new Rupee("Five Hunderd", 500);
        Rupee rs2 = new Rupee("Two Hundred", 200);
        Rupee rs3 = new Rupee("One Thousand", 1000);

        List<Rupee> rupeelist = new ArrayList<>();
        rupeelist.add(rs1);
        rupeelist.add(rs2);
        rupeelist.add(rs3);

        System.out.println("Listing as is in Class");
        System.out.println(rupeelist);
        System.out.println("______________________________");
        // After sorting
        Collections.sort(rupeelist);
        System.out.println(rupeelist);
        System.out.println("Listed as per name in Comparable defined");
        System.out.println("______________________________");


        Collections.sort(rupeelist, new SortbyValueAss());
        System.out.println(rupeelist);
        System.out.println("Listed as per value in assend");
        System.out.println("______________________________");

        Collections.sort(rupeelist, new SortbyValueDesc());
        System.out.println(rupeelist);
        System.out.println("Listed as per value in Desend");
        System.out.println("______________________________");

        Collections.sort(rupeelist, new SortbyAmountAsse());
        System.out.println(rupeelist);
        System.out.println("Listed as per amount in Assend");
        System.out.println("______________________________");

        Collections.sort(rupeelist, new SortbyAmountDesc());
        System.out.println(rupeelist);
        System.out.println("Listed as per amount in Desend");
        System.out.println("______________________________");



    }
}
