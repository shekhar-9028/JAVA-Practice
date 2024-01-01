package src.Basics3;

import java.util.Scanner;

public class Lab017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ënter your Name");
        String name =sc.next();

        System.out.println("Ënter your Age");
        int age =sc.nextInt();

        System.out.println("Ënter your Salary");
        double salary =sc.nextDouble();

        System.out.println("Your details are:" + name + age + salary);
        sc.close();
    }
}
