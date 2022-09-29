package com.MyPackage;

import java.util.Scanner; // 1 uses
//import java.util.*; // 2 uses
public class cwh_65_packages {

    public static void main(String[] args) {
        String name;
        System.out.print("Enter Your Name:- ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        // 3 uses
        java.util.Scanner sc1 = new java.util.Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("This is my scanner taking input as " + a);



    }
}
