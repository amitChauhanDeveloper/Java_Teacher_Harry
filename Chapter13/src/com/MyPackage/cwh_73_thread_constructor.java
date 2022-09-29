package com.MyPackage;

class MyThr extends Thread // Creating a thread by extending thread class and also use constructor Thread(String name) method
{
    public MyThr(String name)
    {
        super(name);
    }
    public void run()
    {
        int j = 34;
        System.out.println("Thank you!");
    }
}
class MyThr2 extends Thread implements Runnable // Create a java thread using runnable interface and also use constructor Thread(String name) constructor
{
    public MyThr2(String name2)
    {
        super(name2);
    }
    public void run()
    {
        int a = 50;
        System.out.println("Thank you harry bro!");
    }
}
public class cwh_73_thread_constructor {
    public static void main(String[] args) {
        
        // Using extends thread class and also use constructor thread(String name)
        MyThr t1 = new MyThr("Amit");
        MyThr t2 = new MyThr("Suraj");
        t1.start();
        t2.start();
        System.out.println("The id of thread is " + t1.getId());
        System.out.println("The name of thread is " + t1.getName());
        System.out.println("The id of thread is " + t2.getId());
        System.out.println("The name of thread is " + t2.getName());

        // Using runnable interfaces in thread and also using thread(String name) constructor
        MyThr2 bullet1 = new MyThr2("Anjali");
        Thread ak47 = new Thread(bullet1);
        MyThr2 bullet2 = new MyThr2("Ajay");
        Thread m41 = new Thread(bullet2);
        ak47.start();
        m41.start();
        System.out.println("The ak47 id of thread is " + ak47.getId());
        System.out.println("The ak47 shooter person name of thread is " + bullet1.getName());
        System.out.println("The m41 id of thread is " + m41.getId());
        System.out.println("The m41 shooter person name of thread is " + bullet2.getName());
    }
}
