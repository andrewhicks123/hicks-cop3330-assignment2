/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */


package ex29;
import java.util.*;

public class App {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        while(true){
            try{
                System.out.print("What is the rate of return? ");
                int rate = Integer.parseInt(in.next());
                System.out.println("It will take "+ calculate(rate) + " years to double your investment.");
                flag = true;
            }catch(NumberFormatException nfe){
                System.out.println("Sorry. That's not a valid input. ");
            }catch(ArithmeticException nfe){
                System.out.println("Sorry. Please enter a number greater than 0. ");
            }
            if(flag) break;
        }
    }
    public static int calculate(int r){
        return 72/r;
    }

}
