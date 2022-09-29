package com.MyPackage;

public class cwh_28_array_multidimensional {
    public static void main(String[] args) {
        int [] marks; // A 1 Dimen Array
        int [] [] flats; // A 2 Dimen Array
        flats = new int [2][3]; // two rows & three coloumn
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        for(int i=0;i<flats.length;i++)
            {
                for(int j=0;j<flats[i].length;j++)
                {
                    System.out.print(flats[i][j]);
                    System.out.print(" ");
                }
                System.out.println("\n");
            }
    }
}
