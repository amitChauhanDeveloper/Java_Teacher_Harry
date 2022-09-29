package com.MyPackage;

interface Bicycle
{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle
{
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle,HornBicycle
{
    void blowHorn()
    {
        System.out.println("Pee Pee Poo Poo...");
    }
    public void applyBrake(int decrement)
    {
        System.out.println(" Applying Brake...");
    }
    public void speedUp(int increment)
    {
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g()
    {
        System.out.println("Kabhi kgushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn()
    {
        System.out.println("Main hoon naa po po po po");
    }
}

public class cwh_55_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        // You can create properties in Interfaces
//        System.out.println(cycle.a);

//         You cannot modify the properties in Interfaces as they are final
//        cycle.a = 60;
//        System.out.println(cycle.a);
          cycle.speedUp(10);
          cycle.blowHorn();
          cycle.blowHornK3g();
          cycle.blowHornmhn();
    }
}
