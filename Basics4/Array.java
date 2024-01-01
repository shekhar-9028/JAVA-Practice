package src.Basics4;

public class Array {
    public static void main(String[] args) {
        int ar[][] = new int[3][3];
        ar[0][0] = 1;
        ar[0][1] = 1;
        ar[0][2] = 1;
        ar[1][0] = 1;
        ar[1][1] = 2;
        ar[1][2] = 1;
        ar[2][0] = 1;
        ar[2][1] = 1;
        ar[2][2] = 3;
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i][i]);
        }

        // With using two for loops
        for (int i1=0; i1<ar.length;i1++){
            for (int j1=0; j1< ar[i1].length;j1++){
                if (i1== j1){
                    System.out.println(ar[i1][j1]);

                }
                else
                    ar[i1][j1]=0;
                    System.out.println();
            }
        }

    }



}

