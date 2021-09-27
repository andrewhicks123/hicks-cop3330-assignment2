/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */


package ex26;
import java.util.*;

public class App {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double balance, apr, payment;
        System.out.println("What is your balance? ");
        balance = input.nextDouble();
        System.out.println("What is the APR on the card (as a percent)? ");
        apr = input.nextDouble();
        System.out.println("What is the monthly payment you can make? ");
        payment = input.nextDouble();

        System.out.println("It will take " + PaymentCalculator.calculateMonthsUntilPaidOff(balance,apr,payment) + " months to pay off this card");
    }
}

class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff(double balance, double apr, double payment){
        apr = apr / 100;
        apr = apr / 365;
        return (int) Math.ceil((-1/30.0) * Math.log(1 + balance / payment * ( 1 - Math.pow(1+apr,30)))/Math.log(1+apr));
    }
}

