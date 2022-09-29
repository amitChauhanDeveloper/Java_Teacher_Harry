package com.MyPackage;

class Base1
{
    Base1()
    {
        System.out.println("I am constructors");
    }
    Base1(int x)
    {
        System.out.println("I am an overloaded constructors with value of x as : " + x);
    }
}

class Derived1 extends Base1
{
    Derived1()
    {
       // super(10);
        System.out.println("I am Derived class constructors");
    }
    Derived1(int x,int y)
    {
        super(x);
        System.out.println("I am an overloaded constructors of Derived with value of y as : " + y);
    }
}
class ChildOfDerived extends Derived1
{
    ChildOfDerived()
    {
        System.out.println(" I am child of derived constructor");
    }
    ChildOfDerived(int x,int y,int z)
    {
        super(x,y);
        System.out.println("I am an overloaded constructors of Derived with value of z as : " + z);
    }
}
public class cwh_46_constructor_In_Inheritance {
    public static void main(String[] args) {
       // Base1 b = new Base1();
       // Derived1 d = new Derived1();
       // Derived1 d = new Derived1(50,100);
       // ChildOfDerived cd = new ChildOfDerived();
          ChildOfDerived cd = new ChildOfDerived(50,100,150);
    }
}
