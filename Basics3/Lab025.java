package src.Basics3;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ënter day");
        int daynumber = sc.nextInt();

        switch(daynumber)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

    }
}
