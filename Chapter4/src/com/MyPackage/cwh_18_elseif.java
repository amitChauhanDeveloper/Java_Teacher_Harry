package com.MyPackage;
import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {
        String var = "Ajay";
        switch (var) {
            case "Ankit":
                System.out.println("You are going to become Adult!");
                break;
            case "Amit":
                System.out.println("You are going to join a job!");
                break;
            case "Ajay":
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
                break;
        }
        System.out.println("Thanks for using my Java Code!");

        /*
            int age;
            System.out.print("Enter Your Age :- ");
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();
         if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi_experienced!");
        }
        else if(age>36){
            System.out.println("You are semi_experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        } */
    }
}
