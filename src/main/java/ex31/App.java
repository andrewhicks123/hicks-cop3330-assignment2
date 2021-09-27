/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */


package ex31;
import java.util.*;

public class App {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = in.nextInt();
        System.out.print("What is your resting heart rate? ");
        int rate = in.nextInt();
        System.out.format("%s","Resting Pulse: " + rate);
        System.out.format("%10s","Age: " + age);
        generateTable(age, rate);
    }
    public static void generateTable(int age, int rate){
        System.out.println();
        System.out.print("Intensity    ");
        System.out.format("| %s\n","Rate");
        System.out.println("-------------|--------");
        for(int i = 0; i < 9; i++){
            System.out.format("%-13s",55+i*5+"%");
            System.out.format("| %d bpm\n",getTarget(rate,age,55+i*5));
        }
    }
    public static int getTarget(int restingHR, int age, double intensity){
        return (int)(((220-age) - restingHR) * intensity/100) + restingHR;
    }
}
