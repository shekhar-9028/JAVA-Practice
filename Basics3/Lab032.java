package src.Basics3;

public class Lab032 {
    public static void main(String[] args) {
        int [] a ={1,2,4,5};
        System.out.println(a[0]);

        // or new method

        int [] values= new int[5];
        System.out.println(values[0]); // Default value is 0

        values[0]=7;
        System.out.println(values[0]); //after assigning value of 0th value is 7.

        float [] ff = {21.21f,52.52f,69.69f};
        float [] ff2= {21.21f, 52.52f, 69.69f};

        System.out.println(ff==ff2);             // arry will compare location memory, not exact content of array

        float [] ff3= ff;
        System.out.println(ff3==ff);           // match as location memory matches...


        ff3[0] =51.51f;                     // now first value of array got changed in both array
        System.out.println(ff3[0]);
        System.out.println(ff[0]);
        System.out.println(ff.length);      // total length of array 3 (starting from 0,1,2)

        for(int p=0; p< ff.length; p++)
        {
            System.out.println(ff3[p]);
                  }

    }
}
