package src.Basics3;
// Leap Year
public class Lab034 {
    public static void main(String[] args) {
        long a = 1995;
        if ((a%4==0 && a%100!=0) || a%400==0){
        System.out.println("Year is Leap Year" + a);

        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
