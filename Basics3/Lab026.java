package src.Basics3;

import java.util.Scanner;

public class Lab026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String browser=sc.nextLine();

        switch (browser.toLowerCase()){
            case ("chrome"):
                System.out.println("You are in chrome browser");
                break;
            case ("edge"):
                System.out.println("You are in edge browser");
                break;
            default :
                System.out.println("No browser found with your entry");
        }

    }
}
