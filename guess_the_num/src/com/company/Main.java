package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        System.out.print("Hello! What is your name? ");
        String userName = in.nextLine();
        System.out.println("Well, " + userName + ", I am thinking of a number between 1 and 20.");



        int guessTheNumber;
        guessTheNumber = (int) (Math.random() * 19 + 1);


        int guess;

        int attemptsNum = 0;
        final int maxAttempts = 3;

        do {
            System.out.print("Take a guess? ");

            guess = in.nextInt();


            System.out.println("Your guess is " + guess);
            if (guess == guessTheNumber)

                System.out.println("Your guess is correct. Congratulations!");

            else if (guess < guessTheNumber)

                System.out.println("Your guess is too low.");

            else if (guess > guessTheNumber)

                System.out.println("Your guess is too high.");
        }
        while (++attemptsNum < maxAttempts);


            if (attemptsNum == maxAttempts)
                System.out.println("You loose. The number was :" + guessTheNumber);
        }
    }