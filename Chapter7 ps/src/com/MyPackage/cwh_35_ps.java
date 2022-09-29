package com.MyPackage;
import java.util.Scanner;

public class cwh_35_ps {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d * %d = %d \n ", n, i, n * i);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    // sum(n) = 1 + 2 + 3 .... +n
// sum(n) = 1 + 2 + 3 ...  + n-1 + n
// sum(n) = sum(n-1) + n
// sum(3) = 3 + sum(2)
// sum(3) = 3 + 2 + sum(1)
// sum(3) = 3 + 2 + 1
    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        } else {
            return n + sumRec(n - 1);
        }
    }

    static void pattern2(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static int fib(int n) {
      /*  if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } */
        if (n==1 || n==2)
        {
            return n-1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    static float avg(float...arr)
    {
        // Available as int [] arr
        float result=0;
        for(float a:arr) // for each loop
        {
            result = result + a;
        }
        return result/arr.length;
    }

    static void pattern1_rec(int n)
    {
        if (n>0)
        {
            pattern1_rec(n-1);
            for (int i=0;i<n;i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern2_rec(int n,int i)
    {

    }

static double celcius(double c)
{
    double fah=98,cel=0;
    cel=(double)fah*9/5+32;
    return cel;
}

    public static void main(String[] args) {
        // problem 1
       /*
        System.out.print("Table of : ");
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        multiplication(n);
        */

        // problem 2
        /*
        System.out.print("Enter how many rows star print : ");
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pattern1(n);
         */

        // problem 3
       /*
        System.out.print("Enter number : ");
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
       int c = sumRec(n);
        System.out.println("Sum of first n number = "  + c);
        */

        // problem 4
       /*
        System.out.print("Enter how many rows star print : ");
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pattern2(n);
        */

        // pattern 5
        // fibonacci series 0,1,1,2,3,5,8,13,21,34
        /*
        System.out.print("Enter a number : ");
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int result = fib(n);
        System.out.println(result);
       */

        // problem 6
//        System.out.println("The avg of 4,3,5 and 10 is: "+ avg(4,3,5,10));

        // problem 7

        // problem 8
        /*
        System.out.print("Enter how many rows star print : ");
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pattern1_rec(n);
        */
        // problem9
        double c;


    }
}
