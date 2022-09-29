package com.MyPackage2;

class Rectangle
{
    public int length;
    public  int width;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

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
    public int area() {
        return length * width;
    }
}

class Cuboid extends Rectangle
{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cuboid(int l, int w, int h)
    {
        super(l, w);
        System.out.println(" I am parameterized constructors of Cuboid class height is : "+ h);
        this.height = h;

    }
    public int surfaceArea()
    {
        return 2*this.length*this.width+2*this.length*this.height+2*this.height*this.width;
    }
    public int volume()
    {
        return this.length*this.width*this.height;
    }
}
public class cwh_52_chapter10_ps_04 {

    public static void main(String[] args) {
        // Problem 4
        Cuboid c = new Cuboid(12,5,10);
        System.out.println(" Area of rectangle is : " + c.area());
        System.out.println("Volume of rectangle is : " + c.volume());
        System.out.println("Surface area of cuboid is : " + c.surfaceArea());
    }
}

