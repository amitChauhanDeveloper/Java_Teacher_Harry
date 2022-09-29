package com.MyPackage;

abstract class Parent
{
     public Parent()
    {
        System.out.println(" I am constructor on Base class");
    }
    public void sayHello()
    {
        System.out.println("Hello");
    }
     abstract public void greet();
}
class Child extends Parent
{
    @Override
    public void greet()
    {
        System.out.println(" Good Morning");
    }
}
abstract class Child2 extends Parent
{
    public void th()
    {
        System.out.println(" I a good");
    }
}
public class cwh_53_abstract_methods {
    public static void main(String[] args) {
//        Parent p = new Parent(); --> error
        Child c = new Child();
//        Child2 c2 = new Child2(); ---> error

    }
}
