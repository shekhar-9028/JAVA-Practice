package src.Basics4;

public class STRINGREVerse {
    public static void main(String[] args) {
        String name = "shekhar";
        char [] ar = name.toCharArray();
        System.out.println(ar.length);
        int left=0;
        int right = ar.length-1;

        while (left < right)
        {
            char temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;
            left++;
            right--;
        }
        String revname = new String(ar);    // converting array to string name again
        System.out.println(revname);
     }
}
