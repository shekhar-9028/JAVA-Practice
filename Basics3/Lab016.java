package src.Basics3;

import java.util.Scanner;

public class Lab016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter Value of X");
        double x = sc.nextDouble();
        System.out.println ("Enter Value of Y");
        double y = sc.nextDouble();
        System.out.println ("Enter Value of Z");
        double z = sc.nextDouble();

        double result ;
        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));

        System.out.println (result);
        sc.close();


    }
}
