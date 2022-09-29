package com.MyPackage;

class MyThread extends Thread
{
        public MyThread(String name)
        {
            super(name);
        }
        public void run()
        {
           int i = 35;
           while(true)
           {
               System.out.println("Thank you! " + this.getName());
           }

        }
}

public class cwh_74_thread_priorities {
    public static void main(String[] args) {
      // Ready Queue: T1 T2 T3 T4 T5
        MyThread t1 = new MyThread("Amit1");
        MyThread t2 = new MyThread("Amit2");
        MyThread t3 = new MyThread("Amit3");
        MyThread t4 = new MyThread("Amit4");
        MyThread t5 = new MyThread("Amit5 (Most Important");

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
