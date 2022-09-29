package com.MyPackage;

class C1 // same class  all four access modifiers explain it
{
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void method1()
    {
        System.out.println(x); // public access in same class
        System.out.println(y); // protected access in same class
        System.out.println(z); // default (no modifier) access in same class
        System.out.println(a); // private access in same class
    }

}
public class cwh_66_access_modifiers {
    public static void main(String[] args) {
        // same package  all four access modifiers explain it
        C1 c = new C1();
        c.method1();
        System.out.println(c.x); // public access in same package
        System.out.println(c.y); // protected access in same package
        System.out.println(c.z); // default (no modifier) access in same package
//      System.out.println(c.a);  // private not access in same package
    }
}
