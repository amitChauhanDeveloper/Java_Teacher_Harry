package com.MyPackage;

class Rectangle
{
    public int length;
    public  int width;
    Rectangle()
    {
        System.out.println(" I am default constructor");
    }

    public Rectangle(int l,int w) {
        this.length = l;
        this.width = w;
        System.out.println(" I am parameterized constructors of Rectangle class length is : " + l);
        System.out.println(" I am parameterized constructors of Rectangle class width is :  " + w);
    }
    public int area()
    {
        return length * width;
    }
}

class Cuboid extends Rectangle
{
    public int height;

    public Cuboid(int l,int w,int h)
    {
        super(l, w);
        System.out.println(" I am parameterized constructors of Cuboid class height is : "+ h);
        this.height = h;

    }
    public int surfaceArea()
    {
        return 2*this.length*this.width+2*this.length*this.height+2*this.height*this.width;
    }
}
public class cwh_52_chapter10_ps_02 {

    public static void main(String[] args) {
        // Problem 2
        Cuboid c = new Cuboid(12,5,10);
        System.out.println(" Area of rectangle is : " + c.area());
        System.out.println("Surface area of cuboid is : " + c.surfaceArea());
    }
}
