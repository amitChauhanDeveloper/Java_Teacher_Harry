package com.MyPackage;

interface SampleInterface{
    void method1();
    void method2();
}

interface childSampleInterface extends SampleInterface
{
   void method3();
   void method4();
}

class SampleClass implements childSampleInterface
{
    public void method1()
    {
        System.out.println("Method1..");
    }
    public void method2()
    {
        System.out.println("Method2..");
    }
    public void method3()
    {
        System.out.println("Method3..");
    }
    public void method4()
    {
        System.out.println("Method4..");
    }
}
public class cwh_58_Inheritance_Interfaces {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
