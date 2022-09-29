package com.MyPackage;


class Base // parent class name Base and this also Superclass
{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base setting x now");
        this.x = x;
    }

    public void printMe()
    {
        System.out.println("I am constructor");
    }
}

class Derived extends Base // Child class name derived and Subclass extends Superclass this name also Subclass
{
   public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class cwh_45_Inheritance {

    public static void main(String[] args) {
    // Creating an object of base class
    Base b = new Base();
    b.setX(4);
    System.out.println(b.getX());

    // Creating an object of Derived class
    Derived d = new Derived();
    d.setY(43);
    System.out.println(d.getY());
    }
}
