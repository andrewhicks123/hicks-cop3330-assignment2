/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */



package ex34;


import java.util.*;
import java.util.ArrayList;


public class App {
    public static void main(String args[]){
        ArrayList<String>names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        printArray(names);
        System.out.print("Enter an employee name to remove: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        removeFromArray(names,name);
        printArray(names);


    }
    static boolean removeFromArray(ArrayList array, String name){
        return array.remove(name);
    }
    public static void printArray(ArrayList array){
        System.out.println("There are " + array.size() + " employees:");
        System.out.println(Arrays.toString(array.toArray()).replace('[', ' ').replace(']', ' ').replace(',', '\n').trim());
    }
}
