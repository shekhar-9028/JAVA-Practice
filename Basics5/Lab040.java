package src.Basics5;

public class Lab040 {
    public static void main(String[] args) {
        String str1 = "Shekhar";
        String str2 = str1.concat(" Ambure");

        System.out.println(str1);
        System.out.println(str2);

        String name = new String("Ambure ORIGINAL");
        System.out.println(name);
        System.out.println(name.contains("A"));
    }
}
