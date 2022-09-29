package com.MyPackage;

class Phone
{
    public void ShowTime()
    {
        System.out.println("Time is 4 Pm");
    }
    public void on()
    {
        System.out.println("Turning on Phone...");
    }
}

class Smartphone extends Phone
{
    public void Music()
    {
        System.out.println("Playing Music...");
    }
    public void on()
    {
        System.out.println("Turning on Smartphone... ");
    }
}
public class cwh_49_dynamic_method_dispatch   {
    public static void main(String[] args) {
//        Phone obj = new Phone(); // Allowed
//        Smartphone smobj = new Smartphone(); // Allowed
//        obj.name();

        Phone obj = new Smartphone(); // Yes it is allowed
//        Smartphone obj2 = new Phone(); // Not allowed
        obj.ShowTime();
        obj.on();
//        obj.music(); // Not allowed
    }
}
