package com.MyPackage;

class Employee{
    private int id;
    private String name;

    public Employee() // ---> constructors
    {
        id = 0;
        name = "CodeWithAmit";
    }
    public Employee(String myName, int myId) // ---> constructors Overloading
    {
        id = myId;
        name = myName;
    }
    public Employee(String myName) // ---> constructors overloading
    {
        id = 1005;
        name = myName;
    }

    public Employee(int myId) // ---> constructors overloading quick quiz employee salary
    {
        id = myId;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int i)
    {
        this.id = i;
    }
}
public class cwh_42_ch9_constructors {
    public static void main(String[] args) {
//        Employee amit = new Employee("My Name is Amit Chauhan..",1001);
//        Employee amit = new Employee("My Name Sanjay Dutt");
        Employee amit = new Employee(10000);
//        amit.setName("CodeWithAmit");
//        amit.setId(1002);
        System.out.println(amit.getId());
        System.out.println(amit.getName());
    }
}
