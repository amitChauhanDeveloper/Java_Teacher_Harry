package com.MyPackage;

public class cwh_33_varargs {
//    static int sum( int a,int b)
//    {
//        return a+b;
//    }
//
//        static int sum( int a,int b,int c)
//        {
//            return a+b+c;
//        }
//
//    static int sum( int a,int b,int c,int d)
//    {
//        return a+b+c+d;
//    }

    static int sum(int x,int...arr)
    {
        // Available as int [] arr
        int result=x;
        for(int a:arr) // for each loop
        {
            result = result + a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial");  // varargs means variable argument
       // System.out.println("The sum of 4 and 5 is: "+ sum()); // compulsary actual argument pass
        System.out.println("The sum of Nothing: "+ sum(0));
        System.out.println("The sum of 4 and 5 is: "+ sum(4,5));
        System.out.println("The sum of 4,3 and 5 is: "+ sum(4,3,5));
        System.out.println("The sum of 4,3,5 and 12 is: "+ sum(4,3,5,12));
    }
}
