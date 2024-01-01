package src.Basics3;

import java.util.Scanner;

public class Lab033 {
    public static void main(String[] args) {
        long arr[] = {9,8,7,6};
        int a;
        for(a=1;a<arr.length-1; a++);
        {

            System.out.println(arr[a]*2);

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter Value for first element in array");
           arr[1]=sc.nextLong();

            System.out.println(arr[1]);

        }
    }
}
