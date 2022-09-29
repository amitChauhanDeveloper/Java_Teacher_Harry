package com.MyPackage;
import java.util.Scanner;

public class cwh_25_ch5_ps {
    public static void main(String[] args) {
   /*
        problem 1 This type start print
        *****
        ****
        ***
        **
        *
             */
//        System.out.print("How many column start line print : ");
//        int n;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for(int i=n;i>0;i--)
//        {
//            for (int j=0; j<i; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        /*
        problem 1 This type start print
            *
            **
            ***
            ****
            *****
         */

//        System.out.print("How many column start line print : ");
//        int n;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for(int i=0;i<=n;i++) //i--> coloums
//        {
//            for (int j=0; j<i; j++) //J--> rows
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//            }

        // problem 2
//        System.out.print("Sum of n even number : ");
//        int sum = 0;
//        int n;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//
//            for(int i=0;i<n;i++)
//            {
//                sum = sum + (2*i);
//            }
//
//        System.out.print("Sum of even numbers is: ");
//        System.out.println(sum);

//         problem 3
//        System.out.print("Enter which table print : ");
//        int n;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i=1;i<=10;i++) ---> goes from i=1 to i=10
//        for (int i=1;i<=10;i++)
//        {
//            System.out.printf("%d X %d = %d \n",n,i,n*i);
//        }

        // problem 4
//        System.out.print("Enter which table print : ");
//        int n;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i>=10;i=1;i++) ---> goes from i=10 to i=1
//        for (int i=10;i>=1;i--)
//        {
//            System.out.printf("%d X %d = %d \n",n,i,n*i);
//        }

        // problem 5
//        System.out.print("Enter a number : ");
//        int n,i,fact=1;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        // 5! = 1*2*3*4*5
//        for (i=1;i<=n;i++)
//        {
//            fact = fact * i;
//        }
//        System.out.println("Factorial of " + n + " is " + fact);

        // problem 6
//        System.out.print("Enter a number : ");
//        int n,i=1,fact=1;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        // 5! = 1*2*3*4*5
//        while(i<=n)
//        {
//            fact = fact * i;
//            i++;
//        }
//        System.out.println("Factorial of " + n + " is " + fact);

        /*
            problem 7 This type start print
            *****
            ****
            ***
            **
            *
         */

//         int i=1,j;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows : ");
//         int n = sc.nextInt();
//         while(i<=n)
//         {
//             j = i;
//
//             while (j <= n) {
//                 System.out.print("*");
//                 j++;
//             }
//
//             i++;
//             System.out.print("\n");
//         }

        /*
        problem 1 This type start print
            *
            **
            ***
            ****
            *****
         */
//            int i,j,n;
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter the number of rows : ");
//            n = sc.nextInt();
//            i = n;
//            while(i>=1)
//            {
//                j=i;
//                        while(j<=n)
//                        {
//                            System.out.print("*");
//                            j++;
//                        }
//                i--;
//                System.out.print("\n");
//            }

        // problem 8 Answer --> True

        // problem 9

//        System.out.print("Enter which table print : ");
//        int n,sum=0;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        // for (int i=1;i<=10;i++) ---> goes from i=1 to i=10
//        for (int i=1;i<=10;i++)
//        {
//            sum= sum + n*i;
//            System.out.printf("%d X %d = %d \n",n,i,n*i);
//        }
//
//        System.out.println("Sum of table value : " +sum);

        // problem 10 A do while loop is executed : At least once

        // problem 11

        System.out.print("Sum of n even number : ");
        int i=0,n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(i<=n)
        {
            sum = sum + (2*i);
            i++;
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
    }
}