package com.MyPackage;
import java.util.Scanner;

class printMessage
{
    void writeMessage()
    {
        String name;
        System.out.print("Enter Your Name : ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hey! your name is  " + name + "....");
    }
}
public class cwh_67_chapter12_ps_02 {

    public static void main(String[] args) {
        printMessage message = new printMessage();
        message.writeMessage();
    }
}
