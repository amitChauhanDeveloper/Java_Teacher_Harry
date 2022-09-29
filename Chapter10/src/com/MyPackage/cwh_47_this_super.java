package com.MyPackage;

class EkClass
{
    int a; // variable declaration
    public int getA() // getters
    {
        return a;
    }

    EkClass(int a)  // constructors
    {
        this.a = a; // this keyword use for reference
    }
    public int returnOne() // method
    {
        return 1;
    }
}
class DoClass extends EkClass
{
    DoClass(int c)  // constructors
    {
        super(c);
        System.out.println("I am constructors");
    }
}
public class cwh_47_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(50);
        DoClass d = new DoClass(55);
        System.out.println(e.getA());
    }
}
