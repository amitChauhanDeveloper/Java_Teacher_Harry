package com.MyPackage;

class MyNewThread1 extends Thread
{
    public void run()
    {
        int i = 0;
        for (i = 1; i<=10;i++)
        {
            System.out.println(i);
            System.out.println("Thank you! Harry bro ");
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class MyNewThread2 extends Thread
{
    public void run()
    {
        int i = 0;
        for (i = 11;i<=20;i++)
        {
            System.out.println(i);
            System.out.println("Thank you! you are great java teacher! ");
        }
    }
}

public class cwh_75_thread_method {
    public static void main(String[] args) {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();
        t1.start();
        try
        {
            t1.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        t2.start();
    }
}
