package com.MyPackage;

import java.util.Scanner;

// Custom exception
class MyException extends Exception
{
    @Override
    public String toString()
    {
        return " I am toString() ";
    }
    @Override
    public String getMessage()
    {
        return  " I am getMessage()";
    }
}
public class cwh_83_exception_class {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<10)
        {
            try
            {
//                throw new MyException();
                throw new ArithmeticException("This is exception");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
