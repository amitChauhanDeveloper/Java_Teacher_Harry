package com.MyPackage;
import java.util.Random;
import java.util.Scanner;

class Game // class game
{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses()  // getter and setter method noOfGuesses
    {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     Game()  // constructor to generate a random number
    {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput() // take user input
    {
        System.out.print("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber() // detect whether the number entered by the user is true or false
    {
        noOfGuesses++;
        if(inputNumber==number)
        {
            System.out.format("Yes you guessed is right, it was %d\n You guessed it in %d attempts",number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number)
        {
            System.out.println("Too low...");
        }
        else if(inputNumber>number)
        {
            System.out.println("Too high...");
        }
        return false;
    }
}
public class cwh_43_ex3sol {
    public static void main(String[] args) {
        System.out.println(
                "            Create a class Game, which allows a user to play \"Guess the Number\"\n" +
                "            game once. Game should have the following methods:\n" +
                "            1. Constructor to generate a random number\n" +
                "            2. takeUserInput to take a user input of number\n" +
                "            3. isCorrectNumber() to detect whether the number entered by the user is true\n" +
                "            4. getter and setter for noOfGuesses\n" +
                "            Use properties such as noOfGuesses(int), etc to get this task done!\n"
                         );
        Game g = new Game();
        boolean b =false;
        while (!b)
        {
        g.takeUserInput();
        b = g.isCorrectNumber();
        }
    }
}
