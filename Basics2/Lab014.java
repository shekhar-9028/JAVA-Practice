package src.Basics2;

import java.util.Arrays;

public class Lab014 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2=" Guys";
        String str3="Hello Guys";

        String str4= str1.concat(str2);
        System.out.println(str4);

        String s1 = "Shekhar";
        System.out.println(s1 instanceof String);
        System.out.println(s1 instanceof Object);
        //Result of instanceof operator is boolean value.
    }
}
