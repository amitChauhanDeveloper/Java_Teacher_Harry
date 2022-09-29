package com.MyPackage;
import java.util.Scanner;

class Employee
{
    int id;
    int salary;
    String name;
    public void printDetails()
    {
        System.out.println("My employee id is " + id);
        System.out.println("My name is " + name);
    }
    public int getSalary()
    {
        return salary;
    }
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is custom class");
        /* System.out.print("Enter a employee id : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.print("Enter a employee name : ");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine(); */

        Employee amit = new Employee(); // Instantiating a new Employee Object
        Employee suraj = new Employee(); // Instantiating a new Employee Object
        // Setting attributes for Amit
        amit.id = 1001;
        amit.name =  "Amit Chauhan";
        amit.salary = 45000;
        // Setting attributes for Suraj
        suraj.id = 1002;
        suraj.name = "Suraj Chauhan";
        suraj.salary = 15000;

        //printing the attributes
        amit.printDetails();
        int salary = amit.getSalary();
        System.out.println("My Salary is " + salary);
        suraj.printDetails();
        int salary1 = suraj.getSalary();
        System.out.println("My Salary is " + salary1);

       //  System.out.println(id);
       // System.out.println(name);
    }
}