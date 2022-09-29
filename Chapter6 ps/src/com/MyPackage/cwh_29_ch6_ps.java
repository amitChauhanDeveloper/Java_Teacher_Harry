package com.MyPackage;
import java.util.Scanner;
public class cwh_29_ch6_ps {
    public static void main(String[] args) {
        // problem 1
       /*
        float [] num = {50.5f,40.5f,30.2f,20.7f,11.5f};
        float sum = 0;
        for (float element:num)
        {
            sum = sum + element;
            System.out.println(" Number : " + element);

        }
        System.out.println("The value of sum is = " + sum);
        */

        // problem 2
        /*
        float [] num = {50.5f,40.5f,30.2f,20.7f,11.5f};
        float num1 = 40.2f;
        boolean isInArray = false;
        for (float element:num)
        {
            if(num1==element)
            {
                isInArray = true;
                break;
            }
        }
        if(isInArray)
        {
            System.out.println("The value is present in the array");
        }
        else
        {
            System.out.println("The value is not present in the array");
        }
         */

        // problem 3
        /*
        int [] marks = {55,65,77,88,97};
        int sum = 0;
        for (int element:marks)
        {
            sum = sum + element;
            System.out.println(" Number : " + element);
        }
        System.out.println("The total of five number = " + sum);
        System.out.println("The average of five number =" + sum/marks.length);
        */

        // problem 4
        /*
        int [][] mat1 = {{1,2,3}, {4,5,6}};
        int [][] mat2 = {{7,8,9}, {1,2,5}};
        int [][] result = {{0,0,0}, {0,0,0}};
        for(int i=0;i<mat1.length;i++) //rows number of times
        {
            {
                for(int j=0;j<mat1[i].length;j++) //column number of times
                {
                    System.out.printf("Setting value for i=%d and j=%d\n", i,j);
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
            }

        }

        for(int i=0;i<mat1.length;i++) //rows number of times
        {
            {
                for(int j=0;j<mat1[i].length;j++) //column number of times
                {
                    System.out.print(result[i][j] + " " );
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println(" ");
            }
        }
        */
        // problem 5
        /*
        int [] arr = {1,2,3,4,5,6};

        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i=0;i<n;i++) {
            // Swap a[i] and a[l-1-i]
            //  a   b   temp
            // |4| |3| | |
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - i - 1] = temp;
        }

        for (int element: arr)
        {
            System.out.print(element + " ");
        }
         */

        // problem 6
        /*
        int [] arr = {1,2,3,50,5,6};
        int max = Integer.MIN_VALUE;
        for (int element:arr)
        {
            if(element>max)
            {
                max = element;
            }
        }
        System.out.println("The value of the maximum element in this array is : " + max);
        */

        // problem 7
        /*
        int [] arr = {-10,0,1,2,3,50,5,6};
        int min = Integer.MAX_VALUE;
        for (int element:arr)
        {
            if(element<min)
            {
                min = element;
            }
        }
        System.out.println("The value of the minimum element in this array is : " + min);
        */

        //problem 8
        boolean isSorted = true;
        int [] arr = {11,2,3,7,9,10};
        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("The value of array element is sorted" );
        }
        else
        {
            System.out.println("The value of array element is not sorted");
        }
    }
}
