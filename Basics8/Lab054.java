package src.Basics8;

public class Lab054 {
    public static void main(String[] args) {
        extracted (0);
    }

    private static void extracted (int b){
        int a = 0;
        if (b==0){
            throw new ArithmeticException("B cant be zero");
        }
        else {
            a= 10/b;
            System.out.println(a);
        }
    }

}
