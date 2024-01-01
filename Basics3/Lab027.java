package src.Basics3;

import java.util.Scanner;

public class Lab027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Char to find vowel");
        // aeiou

        char user_input = sc.next().toCharArray()[0];
        System.out.println(user_input);

        switch (user_input) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");

                // JDK 13
                int itemCode = 002;
                switch (itemCode) {
                    case 001, 002, 003:
                        System.out.println("It's an electronic gadget!");
                        break;
                    case 004, 005:
                        System.out.println("It's a mechanical device!");
                    default:
                        System.out.println("It's a software product!");
                }

                int itemCode1 = 001;
                switch (itemCode1) {
                    case 001 -> System.out.println("It's a laptop!");
                    case 002 -> System.out.println("It's a desktop!");
                    case 003, 004 -> System.out.println("It's a mobile phone!");
                    default -> System.out.println("Hello!");
                }

                char code = 'B';
                int val = switch (code) {
                    case 'A' :
                        yield 65;
                    case 'B' :
                        yield 66;
                    default:
                        throw new IllegalStateException("Unexpected value: " + code);
                };

                System.out.println(val);


        }
    }
}
