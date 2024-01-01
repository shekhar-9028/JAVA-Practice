package src.Basics2;

public class Lab012 {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        // Compound Assignment Operators
        // +=, -=, /= ,*= , %=
        b += 30; // b = b + 30
        System.out.println(b);

        int b1 = 90;
        b1 -= 89;   //b = b-89;
        b1 =  b1+1;
        System.out.println(b1);
        int a1 = -10;

        // Relational Operators
        int age_mamitha = 30;
        int age_pramod = 34;
        boolean result = age_pramod > age_mamitha;
        System.out.println(result);

        // >, < >=,<=, == , != ( ! = )

        int a11 = 10;
        int b11= 10;
        boolean c11 = (a11 >= b11); //OR

        // Reference  int - value, string - ref
        System.out.println(c11);

        // Logical Operator

        // !, && m ||
        // Gates Gates
        //
        // ! -> Not , with boolean or condition
        boolean a21 = true;
        System.out.println(a21);
        System.out.println(!a21);
        System.out.println( !(10>20));

        System.out.println(!(30>90));

        // || - OR
        // T || T -> T
        // T || F -> T
        // F || T -> T
        // F || F -> F


        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


        //  And  &&

        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        int a31 = 12;
        boolean b31 = !(a31 > 10 || a31 < 5);
        System.out.println(b31);

    }
}
