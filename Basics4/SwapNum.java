package src.Basics4;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Value of A");
        int a= Sc.nextInt();
        System.out.println("Enter Value of B");
        int b= Sc.nextInt();

        swap (a,b);
        swap1 (a,b);
        swap2 (a,b);




    }
//with Third Variable
    public static int swap(int a1, int b1) {
        int temp=a1;
        a1 = b1;
        b1 = temp;
        System.out.println(a1);
        System.out.println(b1);
        return 0;
    }
    //without Third Variable
    public static int swap1(int a1, int b1) {
        a1 = a1+b1;
        b1 = a1-b1;
        a1= a1-b1;

        System.out.println(a1);
        System.out.println(b1);
        return 0;
    }
    //without Third Variable
    public static int swap2(int a2, int b2) {
        a2 = a2*b2;
        b2 = a2/b2;
        a2= a2/b2;

        System.out.println(a2);
        System.out.println(b2);
        return 0;
    }




}
