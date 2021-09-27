/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */


package ex32;
import java.util.*;

public class App {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!\n");
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        int diff = input.nextInt();
        guessTheNumber.launchGame(diff);

        }
    }


class guessTheNumber {
    public static void launchGame(int diff) {
        Scanner input = new Scanner(System.in);
        int num = (int)(Math.random() * (Math.pow(10,diff)));
        int guess;
        int count = 0;
        boolean flag = false;
        boolean playing = true;
        while(playing){
            System.out.print("I have my number. What's your guess? ");
            guess = input.nextInt();
            while (true) {
                count++;
                if (guess == num) {
                    System.out.println("You got it in " + count + " guesses!");
                    flag = true;
                    break;
                } else if (guess < num) {
                    System.out.print("Too low! Guess again: ");
                    guess = input.nextInt();
                } else if (guess > num) {
                    System.out.print("Too high! Guess again: ");
                    guess = input.nextInt();
                }
            }
            if (flag) {
                System.out.print("Do you want to play again? (y/n) ");
                String yn = input.nextLine();
                if (yn.equals("n")){
                    playing = false;
                    return;
                }
                if(yn.equals("y")){
                    playing = true;
                    flag = false;
                }
                else return;
            }

        }
    }
}


