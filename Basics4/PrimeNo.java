package src.Basics4;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value to find :");
        int n = sc.nextInt();

        int i,flag=0,m;
        m=n/2;
        // IF it is 0 or 1 its straight forward Not Prime
        if (n==0 || n==1){
            System.out.println("Entered Value is not Prime");
        }
        else { // checking from 2 to mid of entered value
            for (i=2; i<=m; i++){
                if (n%i==0){
                    System.out.println("This is not Prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println("This is Prime Number");
            }
        }



    }
}
