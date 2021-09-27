/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */

// Was unsure of how to make a test for this one, sorry.

package ex28;
import java.util.*;

public class App {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int num = in.nextInt();
        int total = 0;
        for(int i = 0; i < num; i++){
            System.out.println("Enter a number: ");
            total = total + in.nextInt();
        }
        System.out.println("The total is " + total + ".");

    }
}
