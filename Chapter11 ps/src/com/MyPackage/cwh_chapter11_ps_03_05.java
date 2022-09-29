package com.MyPackage;
class Monkey
{
    public void Jump()
    {
        System.out.println("Monkey is Jumping the tree;");
    }
    public void bite()
    {
        System.out.println("Monkey is biting");
    }
}
interface BasicAnimal
{
    public void eat();
    public void sleep();
}

class Human extends Monkey implements BasicAnimal
{
    public void speak()
    {
        System.out.println("Hello sir...");
    }
    public void eat()
    {
        System.out.println("Eating....");
    }
    public void sleep()
    {
        System.out.println("Sleeping....");
    }
}
public class cwh_chapter11_ps_03_05 {
    public static void main(String[] args) {
       // program 3
        Human amit = new Human();
       amit.sleep();

       // program 5
        Monkey m1 = new Human();
        m1.Jump();
        m1.bite();
//        m1.speak();--> Cannot use speak method because the reference is monkey which does not have speak method
        BasicAnimal harry = new Human();
//        harry.speak();---> error
        harry.eat();
        harry.sleep();
    }
}
