package com.MyPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cwh_82_nested_try_catch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 55;
        marks[1] = 75;
        marks[2] = 82;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag)
        {
            System.out.print("Enter the value of index : ");
            int ind = sc.nextInt();
            try
            {
                System.out.println("Welcome to video no 82 ");

                try
                {
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Sorry this index does not exist ");
                    System.out.println("Exception level 2 ");
                }
            }
            catch (Exception e)
            {
                System.out.println("Exception level 1 ");
            }
        }
        System.out.println("Thanks using this program! ");
    }
}
