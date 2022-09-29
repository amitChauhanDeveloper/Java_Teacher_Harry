package com.MyPackage;
import java.util.Scanner;
public class cwh_31_methods {
    static int logic (int x, int y)
    {
        int z;
        if(x>y)
        {
            z = x+y;
        }
        else
        {
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
    int a ,b,c;
    System.out.print("Enter a number 1 : ");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();

    System.out.print("Enter a number 2 : ");
    Scanner sc1 = new Scanner(System.in);
    b = sc1.nextInt();

    c = logic(a,b);
    System.out.println(" Result is : " + c);
    System.out.println(" ");

    int a1 ,b1,c1;
    System.out.print("Enter a number 1 : ");
    Scanner scan = new Scanner(System.in);
    a1 = sc.nextInt();

    System.out.print("Enter a number 2 : ");
    Scanner scan1 = new Scanner(System.in);
    b1 = sc1.nextInt();

    c1 = logic(a1,b1);
    System.out.println(" Result is : " + c1);
    // Method invocation using object
//    cwh_31_methods obj=new cwh_31_methods();

//    int a = 5 ;
//    int b = 7;
//    int c;
//    c = logic(a,b)
//    c = obj.logic(a,b);
//    result = logic(a,b);
//    System.out.println(c);

//     int a1 = 10;
//     int b1 = 5;
//     int c1;
//     c1 = obj.logic(a1,b1);
//     c1 = logic(a1,b1); // this condition false part
//     System.out.println(c1); // this condition true part
    }
}
