/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */

package ex30;

// No math really in this function, so no test.

public class App {
    public static void main(String args[]){
        for(int i = 1; i <= 12; i++){
            for(int j = 1; j <= 12; j++){
                System.out.format("%5d",i*j);
            }
            System.out.print("\n");
        }
    }
}
