package src.Basics2;

import java.util.Scanner;

public class Lab015 {
    public static void main(String[] args) {
        // Take an input from user? Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell if it is even/odd");
        int a  = sc.nextInt();


        if(a%2 == 1)
        {
            System.out.println("ODD Number");
        }
        else
        {
            System.out.println("Even Number");
        }

        System.out.println("Enter the a11,b11");
        int a11 = sc.nextInt();
        int b11 = sc.nextInt();

        if (a11 > b11) {
            System.out.println("Max is " + a11);
        } else {
            System.out.println("Max is " + b11);
        }
    }
}
