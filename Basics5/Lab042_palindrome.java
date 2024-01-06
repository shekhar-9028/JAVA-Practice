package src.Basics5;

import java.util.Scanner;

public class Lab042_palindrome {
    public static void main(String[] args) {
        System.out.println("checking for Palindrome");
        Scanner sc = new Scanner(System.in);
        String userinput = sc.next();
        userinput = userinput.toLowerCase();
        boolean result = palindrome(userinput);
        if(result){
            System.out.println("This is palindrome");
        }
else{
            System.out.println("Not a palindrome");
        }

    }

    private static boolean palindrome(String userinput) {
        String original_str = userinput;
        StringBuilder sb = new StringBuilder(userinput);
        String reverse_string = sb.reverse().toString();
        return original_str.equalsIgnoreCase(reverse_string);

    }
}
