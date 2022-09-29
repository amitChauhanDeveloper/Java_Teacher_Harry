package com.MyPackage;

import java.util.Scanner;

/* There are three types of errors
1) Syntax error
2) Logical error
3) Runtime error ---> also called Exceptions! */

public class cwh_79_errorsdemo {
    public static void main(String[] args) {
        // syntax error demo
        // int a = 5 ---> no semicolon
         int a = 5;
//        System.out.println(a);

        // Logical error demo
        // Write a program to print all prime number between 1 to 10
        System.out.println(2);
        for(int i=1; i<5; i++)
        {
            System.out.println(2*i+1);
        }
/*
        int prime = 0,n = 0,i = 1,j = 1,num;
        System.out.print("Enter a number : ");
        Scanner sc1 = new Scanner(System.in);
        num = sc1.nextInt();
        while(n<num)
        {
            j = 1;
            while (j<=i)
            {
                if (i % j == 0)
                    prime++;
                    j++;
            }
            if(prime == 2)
            {
                System.out.printf(" %d ",i);
                n++;
            }
            i++;
        }
        System.out.println(" ");
 */
        // Runtime error demo
        int k;
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is : " + 1000/k);
        // error runtime enter 0 throw java in built Exceptions throws
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at com.MyPackage.cwh_79_errorsdemo.main(cwh_79_errorsdemo.java:52)
    }
}
