/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */


package ex33;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

// not sure how to make a test for this

public class App {
    public static void main(String args[]){
        String[] array = {"Yes", "No", "Maybe", "Ask again later."};
        Scanner input = new Scanner(System.in);
        System.out.println("What's your question?");
        String question = input.nextLine();
        int rand = getRandom(3);
        System.out.println("> " + question + "\n");
        System.out.println(array[rand]);
    }
    public static int getRandom(int range){
        return ThreadLocalRandom.current().nextInt(0,range+1);
    }
}
