package com.MyPackage;

public class cwh_85_finally {
    public static int greet(){
        try {
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources... This is the end of this program");
        }
        return 0;
    }
    public static void main(String[] args) {
   int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while(true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }
        try {
            System.out.println("amit/amit");
            System.out.println(50/10);
        }
        finally {
            System.out.println("Yes I am finally");
        }
        int j = 10;
        System.out.println(j);
    }
}
