package com.MyPackage;

public class cwh_26_array {

    public static void main(String[] args) {
    	/* classroom of 500 students - you have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
         */
//        There are three main ways to creata an array in java .

//        1. Declaration and memory allocation
//        int [] marks = new int[5];

//        2. Declartion and then memory allocation
//        int [] marks;
//        Initialization
//        marks = new int[5];
//        marks [0] = 100;
//        marks [1] = 80;
//        marks [2] = 60;
//        marks [3] = 40;
//        marks [4] = 20;
//        marks [5] = 90; throws an error

//        3. Declaration, memory allocation and initialization together
        int [] marks = {100,80,60,40,20};
        System.out.println(marks[2]);
    }
}
