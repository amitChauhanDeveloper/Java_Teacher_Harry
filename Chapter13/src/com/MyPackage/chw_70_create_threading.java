package com.MyPackage;

class MyThread1 extends Thread // Creating a thread by extending thread class
{
    @Override
    public void run()
    {
            int i = 0;
            for (i=1;i<=5;i++)
            {
                System.out.println("Thread 1 is Running : " + i);
            }
    }
}

class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        for (i=6;i<=10;i++)
        {
            System.out.println("Thread 2 is Running : " + i);
        }
    }
}

class MyThread3 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while(i<5)
        {
            System.out.println("Thread 3 is Running");
            i++;
        }
    }
}

class MyThread4 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while(i<5)
        {
            System.out.println("Thread 4 is Running");
            i++;
        }
    }
}
public class chw_70_create_threading {
    public static void main(String[] args) {
        // this is sun for start() method

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        /*
        // this is run for run method
        MyThread1 t5 = new MyThread1();
        t5.run();
        MyThread2 t6 = new MyThread2();
        t6.run();
        MyThread3 t7 = new MyThread3();
        t7.run();
        MyThread4 t8 = new MyThread4();
        t8.run();
         */
    }
}
