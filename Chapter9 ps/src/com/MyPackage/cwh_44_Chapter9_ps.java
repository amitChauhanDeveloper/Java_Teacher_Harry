package com.MyPackage;

import java.awt.*;

class Cylinder // class
{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {  // Use constructor
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {   // Use getter and setter method
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() { // method
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() { // method
        return Math.PI * radius * radius * height;
    }
}

class Rectangle
    {
        private int length;
        private int breadth;

        public Rectangle() // constructor
        {
            this.length = 4;
            this.breadth = 5;
        }

        public Rectangle(int length, int breadth) // constructor overload
        {
            this.length = length;
            this.breadth = breadth;
        }

        public int getLength()
        {
            return length;
        }

        public int getBreadth()
        {
            return breadth;
        }
    }

class Sphere // class
{
    private int radius; // variable declaration

    public Sphere(int radius) { // constructor
        this.radius = radius;
    }

    public int getRadius() { // gets and set method
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceArea() { // calculate surface area of sphere
        return 4 * Math.PI * radius * radius ;
    }

    public double volume() { // calculate volume of sphere
        return 4/3 * Math.PI * radius * radius * radius;
    }
}


public class cwh_44_Chapter9_ps {
    public static void main(String[] args) { // main method
        // problem 1
        /*
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        System.out.println(" Height " + myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(" Radius " + myCylinder.getRadius());
        // problem 2
        System.out.println(" Surface Area of cylinder " + myCylinder.surfaceArea());
        System.out.println(" Area of volume " +myCylinder.volume()); */
        /*
        // problem 3
        Cylinder myCylinder = new Cylinder(9,12);
        System.out.println(" Surface Area of cylinder " + myCylinder.surfaceArea());
        System.out.println(" Area of volume " +myCylinder.volume()); */

        // problem 4
       /*  Rectangle r = new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth()); */

        // problem 5

        Sphere mySphere = new Sphere(9);
       // mySphere.setRadius(9);
        System.out.println(" Radius : " + mySphere.getRadius());
        System.out.println(" Surface Area of cylinder " + mySphere.surfaceArea());
        System.out.println(" Area of volume " +mySphere.volume());
    }
}



