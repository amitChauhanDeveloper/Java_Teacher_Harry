package com.MyPackage;

class Employee {
    int salary;
    String name;
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class CellPhone{
    public void ring()
    {
        System.out.println("Ringing...");
    }
    public void vibrate()
    {
        System.out.println("vibrating...");
    }
    public void callFriend()
    {
        System.out.println("calling suraj...");
    }
}

class square{
    int side;
    public int area ()
    {
        return side*side;
    }
    public int paremeter()
    {
        return 4*side;
    }
}

class rectangle{
    int l=10;
    int w=10;
    int result;
    public int area ()
    {
        return result = 2*(l+w);
        //return ;
    }
    public int paremeter()
    {
        return result = w*l;
    }
}

class circle {
    float pi = 3.14f;
    int radius = 5;
    float result;

    public float area() {
        return result = 3.14f * (radius * 2);
    }
    public float parameter(){
        return result = 2 * 3.14f * radius;
    }
}
class Tommy
{
    public void hit()
    {
        System.out.println("Hitting the enemy...");
    }
    public void run()
    {
        System.out.println("Running from  the enemy...");
    }
    public void fire()
    {
        System.out.println("Firing on the enemy...");
    }
}

public class cwh_39_chapter8_ps {

    public static void main(String[] args) {
        // problem 1

        System.out.println("Problem 1 ");
        System.out.println("---------------------");
        Employee amit = new Employee();
        amit.salary = 15000;
        amit.setName("Amit Chauhan");
        System.out.println("Salary of employee is " + amit.getSalary());
        System.out.println(" Name of employee is " + amit.getName());
        System.out.println("---------------------\n");

        // problem 2
        System.out.println("Problem 2 ");
        System.out.println("---------------------");
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();
        System.out.println("---------------------\n");


        // problem 3
        System.out.println("Problem 3 ");
        System.out.println("---------------------");
        square sq = new square ();
        sq.side = 3;
        System.out.println("Area of square is " + sq.area());
        System.out.println("Parameter of square is " + sq.paremeter());
        System.out.println("---------------------\n");


        // problem 4
        System.out.println("Problem 4 ");
        System.out.println("---------------------");
        rectangle rec = new rectangle();
        rec.result = 0 ;
        System.out.println(" Area Of rectangle is " + rec.area());
        System.out.println(" Parameter Of rectangle is " + rec.paremeter());
        System.out.println("---------------------\n");

        // problem 5
        System.out.println("Problem 5 ");
        System.out.println("---------------------");
        Tommy player1 = new Tommy();
        player1.hit();
        player1.run();
        player1.fire();
        System.out.println("---------------------\n");

        // problem 6
        System.out.println("Problem 6 ");
        System.out.println("---------------------");
        circle circle = new circle();
        circle.result = 0 ;
        System.out.println(" Area Of circle is " + circle.area());
        System.out.println(" Parameter Of circle is " + circle.parameter());
        System.out.println("---------------------\n");
    }
}
