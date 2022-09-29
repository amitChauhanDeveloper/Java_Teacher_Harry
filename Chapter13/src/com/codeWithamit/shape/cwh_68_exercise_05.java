package com.codeWithamit.shape;

/*
---- Write this code in notepad ----
You have to create a package named com.codeWithamit.shape
This package should have individual classes for Rectangle,square,Circle,Cuboid,Sphere
These classes should use inheritance to properly manage the code!
Include methods like volume, surface area snd getter/setters for dimensions
 */

class Rectangle
{
    public int length;
    public int breadth;

    public int getLength()
    {
        return this.length;
    }

    public int getBreadth()
    {
        return this.breadth;
    }

    public void setLength()
    {
        this.length = length;
    }

    public void setBreadth()
    {
        this.breadth = breadth;
    }

    public Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;

        System.out.println("Rectangle length is : " + length);
        System.out.println("Rectangle breadth : " + breadth);
    }

    public int area()
    {
        return this.length * this.breadth;
    }
}

class Square
{
    public int side;

    public int getSide()
    {
        return this.side;
    }

    public void setSide()
    {
        this.side = side;
    }

    public Square(int side)
    {
        this.side = side;
        System.out.println("Square side is : " + side);
    }

    public int area()
    {
        return this.side * this.side;
    }
}

class Circle
{
    public int radius;

    public int getRadius()
    {
        return this.radius;
    }

    public void setRadius()
    {
        this.radius = radius;
    }

    public Circle(int radius)
    {
        this.radius = radius;
        System.out.println("Circle radius is : " + radius);
    }

    public double area()
    {
        return Math.PI * this.radius * this.radius;
    }
}

class Cuboid extends Rectangle
{
    public int height;

    public int getHeight()
    {
        return this.height;
    }

    public void setHeight()
    {
        this.height = height;
    }

    public Cuboid(int length,int breadth,int height)
    {
        super(length,breadth);
        this.height = height;
        System.out.println("(length and breadth inherit to rectangle class)Cuboid height is : " + height);
    }

    public double volume()
    {
        return this.length * this.breadth * this.height;
    }
}

class Sphere extends Circle
{
    public Sphere(int radius)
    {
        super(radius);
        System.out.println("(radius inherit to circle class)");
    }

    public double volume()
    {
        return 4/3 * Math.PI * this.radius * this.radius * this.radius;
    }
}

public class cwh_68_exercise_05 {
    public static void main(String[] args)
    {
        System.out.println("-------- Rectangle Class ------------\n");
        Rectangle r = new Rectangle(10,20);
        System.out.println("Area of Rectangle is " + r.area());
        System.out.println("-------- ******* ------------\n");

        System.out.println("-------- Square Class ------------\n");
        Square s = new Square(50);
        System.out.println("Area of Square is " + s.area());

        System.out.println("-------- ******* ------------\n");

        System.out.println("-------- Circle Class ------------\n");
        Circle c = new Circle(5);
        System.out.println("Area of Circle is " + c.area());
        System.out.println("-------- ******* ------------\n");

        System.out.println("-------- Cuboid Class ------------\n");
        Cuboid cb = new Cuboid(30,10,5);
        System.out.println("Volume of Cuboid is " + cb.volume());
        System.out.println("-------- ******* ------------\n");

        System.out.println("-------- Sphere Class ------------\n");
        Sphere sp = new Sphere(8);
        System.out.println("Volume of Sphere is " + sp.volume());
        System.out.println("-------- ******* ------------\n");
    }
}
