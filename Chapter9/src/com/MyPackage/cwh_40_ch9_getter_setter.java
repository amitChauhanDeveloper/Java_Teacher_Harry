package com.MyPackage;

class MyEmployee{
    private int id;
    private String name;

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

public class cwh_40_ch9_getter_setter {
    public static void main(String[] args) {
        MyEmployee amit = new MyEmployee();
        // amit.id = 10001;
        // amit.name = "Amit Chauhan"; ---> Throws an error due to  private access modifier
        amit.setName("Amit Chauhan...");
        System.out.println(" My name is " + amit.getName());
        amit.setId(1001);
        System.out.println(" My employee id  is " + amit.getId());
    }
}
