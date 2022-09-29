package com.MyPackage;

import java.util.Scanner;

// problem 4
class MaxRetire extends Exception
{
    @Override
    public String toString()
    {
        return "pls enter valid array index" ;
    }
    @Override
    public String getMessage()
    {
        return "pls enter valid array index";
    }
}
public class cwh_85_ch14_ps {

    public static void main(String[] args) {
        // problem 1
      // Syntax error --->  int a = 7
      int age = 78;
      int year_born = 2000-78; // Logical error
//      System.out.println(6/0); // Exception error

        // problem 2
        try
        {
            int a = 666/0;
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Hehe");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Haha");
        }
        // problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 55;
        marks[1] = 75;
        marks[2] = 95;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i<5)
        try
        {
            System.out.print("Enter a array index number :");
            index = sc.nextInt();
            System.out.println("The value of marks[index] is " + marks[index]);
            break;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println("Invalid index");
            i++;
        }
        if (i>=5)
        {
            System.out.println("Error");

        }
    }
}
