package src.Basics2;

public class Lab013
{
    public static void main(String[] args) {
        // Casting - Mold
        //  Widening is the process of converting lower type to higher type. This is safe conversion.

        byte b = 10;
//        int a =  b; // Implicit Casting - JVM
        int a = (int) b; // Explicit Casting - JVM


        // Narrowing is the process of converting higher type to lower type.
        int a1 = 300;
        // byte b1 = a1; // Invalid - Implicit Casting
        byte b1 = (byte)a1; // EXPLICIT casti
        System.out.println(b1);


        // 32 Bits
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
        // will be sotred into the b
        // 0 0 1 0 1 1 0 0
//        0 * 27 + 0 * 26 + 1 * 25 + 0 * 24 + 1 * 23 + 1 * 22 + 0 * 21 + 0 * 20
//        0 + 0 + 32 + 0 + 8 + 4 + 0 + 0
        //44

        float course = 100;
        float GST = 18.45f;
        double total = course+ GST;
        System.out.println(total);

        String s1 = "Shekhar";
        // String Constant Pool - SCP / String Pool

        // new Operator - Object
        String s2 = new String("Shekhar");
        //new operator is used to create the new object for class.
        // It returns of the address of newly created object.
        System.out.println(s2);
        System.out.println(new String("Shekhar"));

        byte b11=10;
        int a11=b11; // VALID – Implicit Casting
        int a111= (int)b11; // VALID – Explicit Casting

        String name = "Shekhar AMbURE"; //SCP
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String name1 = new String("Shekhar AMBURE"); //OA? HEAP Area

        String names = "The Testing Academy";
        String names1 = "The Testing Academy";
        String names2 = new String("The Testing academy"); // Heap area
//
//        System.out.println(names == names1);
//        System.out.println(names.equals(names1));


//        System.out.println(names == names2);

        System.out.println(name.equals(names2));
        System.out.println(name.equalsIgnoreCase(names2));


    }
}
