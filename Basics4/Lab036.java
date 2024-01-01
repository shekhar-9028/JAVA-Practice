package src.Basics4;

import java.util.Scanner;

public class Lab036 {
    public static void main(String[] args) {

int d = shekhar_sum(3,4);
        System.out.println(d);
        float f = shekhar_sum(3.5f);    // we can call function with same name but only variables are different.
        System.out.println("Value of f is " + f);
    }
static int shekhar_sum(int a,int b) {
    int c = a+b;
    System.out.println("Value of C is " + c);
    return c;
}

static float shekhar_sum(float a){
    System.out.println("Enter Value");
    Scanner sc = new Scanner(System.in);
    float e = sc.nextFloat();
    float e1 = e;
    return e1;



}

}
