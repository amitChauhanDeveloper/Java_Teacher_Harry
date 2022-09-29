package com.MyPackage;

import java.util.Scanner;

public class cwh_81_exception_handling {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 55;
        marks[1] = 75;
        marks[2] = 82;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index : ");
        int ind = sc.nextInt();

        System.out.print("Enter the number you want to divide the value with : " );
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/number);
        }
        catch (ArithmeticException e) // handing specific Exceptions
        {
            System.out.println("ArithmeticException occured! ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occured! ");
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println("Some other exception occured! ");
            System.out.println(e);
        }
    }
}
