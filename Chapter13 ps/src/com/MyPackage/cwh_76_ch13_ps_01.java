package com.MyPackage;

class MyThread extends Thread
{
    public void run()
    {
        while (true)
        {
            try {
                Thread.sleep(900); // problem 2
            }
            catch (Exception e)
            {
                System.out.println(e);
            }

            System.out.println("Good Morning! ");
        }
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
       while (true)
        {
            try {
                Thread.sleep(700); // problem 2
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Welcome! ");
        }
    }
}
public class cwh_76_ch13_ps_01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2(); // problem 1
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority()); // problem 3
        System.out.println(t2.getPriority());
        t1.start();
        System.out.println(t1.getState());
        t2.start();
        System.out.println(t2.getState()); // problem 4
        System.out.println(Thread.currentThread().getPriority());
    }
}
