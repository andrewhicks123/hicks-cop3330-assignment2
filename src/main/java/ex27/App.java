/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */



package ex27;
import java.util.*;

public class App {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String fname;
        String lname;
        String zip;
        String empid;

        System.out.println("Enter the first name: ");
        fname = input.nextLine();
        System.out.println("Enter the last name: ");
        lname = input.nextLine();
        System.out.println("Enter the ZIP code: ");
        zip = input.nextLine();
        System.out.println("Enter the employee ID: ");
        empid = input.nextLine();

        boolean v = Validations.validateInput(fname,lname,zip,empid);
        if(v == true){
            System.out.println("There were no errors found.");
        }
    }
}


class Validations {
    public static boolean validateInput(String fname, String lname, String zip, String empid){
        boolean v = true;
        if(validateFnameIn(fname) == false){
            v = false;
            System.out.println("The first name must be filled in.");
        }
        if(validateLnameIn(lname) == false){
            v = false;
            System.out.println("The last name must be filled in.");
        }
        if(validateFirstName(fname) == false){
            v = false;
            System.out.println("The first name must be at least 2 characters long.");
        }
        if(validateLastName(lname) == false){
            v = false;
            System.out.println("The first name must be at least 2 characters long.");
        }
        if(validateZip(zip) == false){
            v = false;
            System.out.println("The zipcode must be a 5 digit number.");
        }
        if(validateEmpId(empid) == false){
            v = false;
            System.out.println("The employee ID must be in the format of AA-1234.");
        }
        return v;
    }
    public static boolean validateFirstName(String fname){
        int length = fname.length();
        if(length <= 2) return false;
        else return true;
    }
    public static boolean validateLastName(String lname){
        int length = lname.length();
        if(length <= 2) return false;
        else return true;

    }
    public static boolean validateZip(String zip){
        if(isNumeric(zip) == false) return false;
        int length = String.valueOf(zip).length();
        if(length == 5) return true;
        else return false;
    }
    public static boolean validateEmpId(String empid){
        boolean match = empid.matches("^[A-Z]{2}[-][0-9]{4}");
        return match;
    }
    public static boolean validateFnameIn(String fname){
        return !fname.isEmpty();
    }
    public static boolean validateLnameIn(String lname){
        return !lname.isEmpty();
    }
    public static boolean isNumeric(String num){
        try {
            int d = Integer.parseInt(num);
        } catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }
}
