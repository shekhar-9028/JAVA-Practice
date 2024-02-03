package src.Basics9;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Lab071 {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("WaterMelon");
        fruits.add("Orange");
        System.out.println(fruits);
        // No ordering maintain in Hashset

        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Mango"));

        Set<String> fruits2 = new TreeSet();
        fruits2.add("Apple");
        fruits2.add("WaterMelon");
        fruits2.add("Orange");
        System.out.println(fruits2);
        // Sorting maintain in Treeset

        System.out.println(fruits2.size());
        System.out.println(fruits2.isEmpty());
        System.out.println(fruits2.contains("Mango"));

        Set<String> fruits3 = new LinkedHashSet<>();
        fruits3.add("Apple");
        fruits3.add("WaterMelon");
        fruits3.add("Orange");
        System.out.println(fruits3);
        // No ordering maintain in LinkedHashset

        System.out.println(fruits3.size());
        System.out.println(fruits3.isEmpty());
        System.out.println(fruits3.contains("Mango"));


    }
}
