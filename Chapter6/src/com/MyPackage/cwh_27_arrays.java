package com.MyPackage;

public class cwh_27_arrays {
    public static void main(String[] args) {
      /*   int [] marks = {100,80,60,40,20};
          float [] marks = {95.5f,80.5f,60.5f,55.5f,51.5f};
          String [] students ={"Amit","Suraj","Anjali","Ajay","Sanjay","Mohan"};
          System.out.println(students[2]);
          System.out.println(students.length);

       */

            int [] marks = {100,80,60,40,20};
//          System.out.println(marks.length);
//          Display the array simple way
//          System.out.println(marks[0]);
//          System.out.println(marks[1]);
//          System.out.println(marks[2]);
//          System.out.println(marks[3]);
//          System.out.println(marks[4]);

//            Display the array for loop
//            for(int i=0;i<marks.length;i++)
//            {
//                System.out.println(marks[i]);
//            }

//            Display the array in reverse using for loop
//            for(int i=marks.length-1;i>=0;i--)
//            {
//                System.out.println(marks[i]);
//            }

//            Display the array in using for-each loop
            for(int element: marks)
            {
                System.out.println(element);
            }
    }
}
