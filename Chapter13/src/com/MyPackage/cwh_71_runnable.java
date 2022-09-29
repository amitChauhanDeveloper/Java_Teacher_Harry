package com.MyPackage;

class MyThreadRunnable1 implements Runnable // Create a java thread using runnable interface
{
    public void run()
    {
        int i = 0;
        for (i=1;i<=10;i++)
        System.out.println("I am running thread 1 runnable interface : "  + i);
    }
}

class MyThreadRunnable2 implements Runnable
{
    public void run()
    {
        int i = 0;
        for (i=11;i<=20;i++)
        System.out.println("I am running thread 2 runnable interface : " + i);
    }
}
public class cwh_71_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
