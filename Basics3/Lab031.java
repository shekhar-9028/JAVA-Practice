package src.Basics3;

import java.util.Scanner;

public class Lab031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value to be checked");
        long value= sc.nextLong();

        boolean flag = false;
        for (int i = 2; i <= value / 2; i++)
        {
            // condition for nonprime number
            if (value % i == 0) {
                flag = true;
                System.out.println(value + " is not a prime number.");
                break;
            }
            else
                System.out.println(value + " is a prime number.");
        }





    }
}
