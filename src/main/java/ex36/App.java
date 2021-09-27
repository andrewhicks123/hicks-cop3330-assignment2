/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */


package ex36;
import java.util.*;

import static java.lang.Integer.parseInt;


public class App {
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums = takeInput();
        printNums(nums);
        System.out.println("The average is " + MathCalculations.average(nums));
        System.out.println("The minimum is " + MathCalculations.min(nums));
        System.out.println("The maximum is " + MathCalculations.max(nums));
        System.out.print("The standard deviation is ");
        System.out.format("%.2f", MathCalculations.std(nums));
    }
    public static ArrayList<Integer> takeInput(){
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String current = null;
        do{
            System.out.print("Enter a number: ");
            current = input.nextLine();
            if(!current.equals("done") && MathCalculations.isInteger(current)) {
                int adding = parseInt(current);
                nums.add(adding);
            }
        }while(!current.equals("done"));

    return nums;
    }

    public static void printNums(ArrayList<Integer> nums){
        System.out.println("Numbers: " + nums.toString().replace("[","").replace("]",""));
    }
}

class MathCalculations {
    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }
    public static double average(ArrayList<Integer> nums){
        int total = 0;
        for(int i = 0; i < nums.size(); i++){
            total = total + nums.get(i);
        }
        return total/nums.size();
    }
    public static int min(ArrayList<Integer> nums){
        int min = nums.get(0);
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) < min){
                min = nums.get(i);
            }
        }
        return min;
    }
    public static int max(ArrayList<Integer> nums){
        int max = nums.get(0);
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) > max){
                max = nums.get(i);
            }
        }
        return max;
    }
    public static double std(ArrayList<Integer> nums){
        double sum = 0.0, std = 0.0;
        int length = nums.size();
        for(double num : nums){
            sum+=num;
        }
        double mean = sum/length;
        for(double num:nums){
            std += Math.pow(num-mean,2);
        }
        return Math.sqrt(std/length);
    }
    public static boolean isInteger(String n){
        if(n.isEmpty()) return false;
        for(int i = 0; i<n.length();i++){
            if (i == 0 && n.charAt(i)=='-'){
                if(n.length() == 1) return false;
                else continue;
            }
            if(Character.digit(n.charAt(i),10) < 0) return false;
        }
        return true;
    }
}

