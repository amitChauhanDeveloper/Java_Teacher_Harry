package com.MyPackage;
import java.util.Scanner;

public class cwh_19_ch4_ps {
    public static void main(String[] args) {
        // Problem  1 (throw the error)
//        int a = 10;
//        if(a = 11)
//        {
//            System.out.println("I am 11");
//        }
//        else
//        {
//            System.out.println("I am not 11");
//
//        }
        // problem 2
//        byte m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your marks in java :-");
//        m1 = sc.nextByte();
//        System.out.print("Enter your marks in python :-");
//        m2 = sc.nextByte();
//        System.out.print("Enter your marks in C++ :-");
//        m3 = sc.nextByte();
//        int sum = m1+m2+m3;
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Total marks of three subjects = "+sum);
//        System.out.println("Your Overall average percentage is: " + avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
//        {
//            System.out.println("Congratulations, You have promoted");
//        }
//        else
//        {
//            System.out.println("Sorry, You have not been promoted try again");
//        }
//        // Problem 3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your income in lakhs per annum : ");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income < 2.5)
//        {
//            tax = tax + 0;  // calculate less than 2.0 lakh tax is calculate zero
//        }
//        else if(income > 2.5f && income <= 5.0f )
//        {
//            tax = tax + 0.05f * (income - 2.5f ); // calculate tax 2.5 lakh to 5.0 lakh ( 5 per% )
//        }
//        else if(income > 5.0f && income <= 10.0f )
//        {
//            tax = tax + 0.05f * (5.0f - 2.5f );  // calculate tax 2.5 lakh to 5.0 lakh ( 5 per% )
//            tax = tax + 0.2f * (income - 5.0f); // calculate tax 5.0 lakh to 10.0 lakh ( 20 per% )
//        }
//        else if(income > 10.0f )
//        {
//            tax = tax + 0.05f * (5.0f - 2.5f ); // calculate tax 2.5 lakh to 5.0 lakh ( 5 per% )
//            tax = tax + 0.2f * (10.0f - 5.0f);  // calculate tax 5.0 lakh to 10.0 lakh ( 20 per% )
//            tax = tax + 0.3f * (income - 10.0f); // calculate tax greater than 10 lakh ( 30 per% )
//        }
//        System.out.println("The total tax paid  by the employee is : " + tax); // print tax value

        // problem 4
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter a number : ");
//          byte day = sc.nextByte();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thusday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("pls enter valid input");
//                break;
//        }
        // problem 5
//        int year;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Year : ");
//        year = sc.nextInt();
//        if((year % 400 == 0) || ((year % 4 == 0 ) && (year % 100 !=0)))
//        {
//            System.out.println(year + " : Leap Year");
//        }
//
//        else
//        {
//            System.out.println(year + " : Non - Leap Year ");
//        }
        // problem 6
        System.out.print("Enter a website url : ");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org"))
        {
            System.out.println("This is an organizational website");
        }

        else if(website.endsWith(".com"))
        {
            System.out.println("This is an Commerical website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("This is an Indian website");
        }
    }
}