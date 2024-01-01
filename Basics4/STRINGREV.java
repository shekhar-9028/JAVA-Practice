package src.Basics4;

import java.util.Scanner;

public class STRINGREV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String empty ="";

        for (int i=name.length()-1; i>=0 ; i--)
        {
            empty = empty + name.charAt(i);

        }
        System.out.println(empty);


    }
}
