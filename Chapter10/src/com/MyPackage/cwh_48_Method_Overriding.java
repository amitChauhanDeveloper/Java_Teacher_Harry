package com.MyPackage;

class A
{
    public int a;
    public int amit()
    {
        return 4;
    }
    public void method2()
    {
        System.out.println("I am method 2 of class A");
    }
}
class B extends A
{
    @Override
    public void method2()
    {
        System.out.println("I am method 2 of class B");
    }
    public void method3()
    {
        System.out.println("I am method 3 of class B");
    }
}
public class cwh_48_Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();

        B b = new B();
        b.method2();
    }
}
