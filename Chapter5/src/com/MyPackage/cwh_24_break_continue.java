package com.MyPackage;

public class cwh_24_break_continue {
    public static void main(String[] args) {
        // Break and continue using loops

        // Using For loop
//        for (int i=1;i<=5;i++)
//        {
//            System.out.print(i);
//            System.out.println(" harry bro is great...");
//            if(i==3)
//            {
//                System.out.println("Ending the loop");
//                break;
//            }
//        }

//            Using While loop
//        int i = 1;
//        while(i<=5)
//        {
//            System.out.print(i);
//            System.out.println(" harry bro is great...");
//            if(i==3)
//            {
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }

        // Using do While loop

//        int i = 1;
//        do {
//            System.out.print(i);
//            System.out.println(" harry bro is great...");
//            if (i == 3)
//            {
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while (i < 5);

//         Continue Using For loop
//        for (int i=1;i<=5;i++)
//        {
//            if(i==3)
//            {
//                System.out.println("Continue");
//                continue;
//            }
//            System.out.print(i);
//            System.out.println(" harry bro is great...");
//        }

//        Continue Using While loop
//        int i = 0;
//        while(i<5)
//        {
//            i++;
//            if(i==3)
//            {
//                System.out.println("Ending the loop");
//                continue;
//            }
//            System.out.print(i);
//            System.out.println(" harry bro is great...");
//        }

        // do While loop

        int i = 0;
        do {
            i++;
            if (i == 3)
            {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.print(i);
            System.out.println(" harry bro is great...");
        }while (i < 5);
    }
}

