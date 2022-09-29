package com.MyPackage;

public class cwh_32_method_overloading {
    static void m_o() //() parameter
    {
        System.out.println("Good Morning bro!");
    }

    static void m_o(int a) //(int a) parameter
    {
        System.out.println("Good Morning " + a + " bro!");
    }

    static void m_o(int a,int b) //(int a,int b) parameter
    {
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }



   static  void change(int a) //(int a) parameter
   {
       a = 98;
   }

    static  void change2(int [] arr) //(int [] arr) parameter
    {
        arr [0] = 98;
    }
    static void tellJoke() //() parameter
    {
        System.out.println("I invented a new worlds\n" +
                "Plagiarism!");
    }
    public static void main(String[] args) {
//     tellJoke();

//        Case 1: Changing the Interger
//        int x = 45;
//        change(x);
//        System.out.println("The values of x after running change is: " + x);

//        Case 2: Changing the array
//        int [] marks = {35,45,77,88,52};
//        change2(marks);
//        System.out.println("The values of x after running change is: " + marks[0]);

        // Method overloading
        System.out.println("-->  Defination :- Method overloading is same method name but diffrent parameter pass it is knowns as method over loading. \n" +
                "Method overloading cannot be performed by changing the return type of methods.. ");
        m_o();
        m_o(1000);
        m_o(1000,1000);
        // Argument are actual
   }
}
