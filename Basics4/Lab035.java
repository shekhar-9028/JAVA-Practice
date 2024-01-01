package src.Basics4;

import static src.Basics4.Lab035.shekhar_sum;

public class Lab035 {
    public static void main(String[] args) {

int d = shekhar_sum(3,4);
        System.out.println(d);

    }
static int shekhar_sum(int a,int b) {
    int c = a+b;
    System.out.println("Value of C is " + c);
    return c;
}

}
