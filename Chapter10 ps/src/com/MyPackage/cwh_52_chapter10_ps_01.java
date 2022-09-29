package com.MyPackage; // Create a package

class Circle // Create Circle class
{
    public int radius; // Variable declaration
    Circle () // Create a default constructor
    {
        System.out.println(" I am default of Circle Constructor"); // print default constructors
    }

    Circle(int r) // Create a parameterized constructors
    {
        System.out.println(" I am Circle Parameterized Constructors : " + r); // print Parameterized constructors
        this.radius = r; // pass the reference variable of radius using this keyword
    }

    public double area() // Create a circle method for calculate area of circle
    {
        return Math.PI*this.radius*this.radius; // formula measure area of circle
    }
}

class Cylinder extends Circle // using parent class circle for using extends keyword that is Inheritance
{
    public int height; // Variable declaration
    Cylinder(int r,int h) // // Create a parameterized constructors
    {
        super(r); // call parent class parameterized constructors using super keyword
        System.out.println(" I am Cylinder parameterized  Constructor : " + h); //  print Parameterized constructors
        this.height = h; // pass the reference variable of height using this keyword
    }

    public double volume() // Create calculate volume of circle
    {
        return Math.PI*this.radius*this.radius*this.height; // formula volume of circle
    }
}
public class cwh_52_chapter10_ps_01 { // main method class

    public static void main(String[] args) { // main method
	// Problem 1
//        Circle objC = new Circle(12);
        Cylinder obj = new Cylinder(12,4); // create new object
        System.out.println("Area Of Circle = " + obj.area()); // print area of circle
        System.out.println("Volume of Circle  =  " + obj.volume()); // print volume of circle
    }
}
