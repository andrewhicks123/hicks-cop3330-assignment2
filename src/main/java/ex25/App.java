/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */

package ex25;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String gradeChar = null;
        System.out.println("Enter a password: ");
        String password = input.nextLine();
        int grade = passwordValidator(password);
        if(grade == 1) {
            gradeChar = "very weak";
        }
        if(grade == 2) {
            gradeChar = "weak";
        }
        if(grade == 3) {
            gradeChar = "strong";
        }
        if(grade == 4) {
            gradeChar = "very strong";
        }
        System.out.println("The password '" + password + "' is a " + gradeChar + " password.");
    }
    public static int passwordValidator(String password){
        int l = password.length();
        int grade = 0;
        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern chara = Pattern.compile("[a-zA-Z]");

        Matcher hasChar = chara.matcher(password);
        Matcher hasSpecial = special.matcher(password);
        Matcher hasDigit = digit.matcher(password);

        if(l < 8 && (hasChar.find() == false) && (hasDigit.find() == true) && (hasSpecial.find() == false)){
        // very weak
            grade = 1;
        }
        if(l < 8 && (hasChar.find() == true) && (hasDigit.find() == false) && (hasSpecial.find() == false)){
        // weak
            grade = 2;
        }
        if(l >= 8 && (hasChar.find() == true) && (hasDigit.find() == true) && (hasSpecial.find() == false)){
        // strong
            grade = 3;
        }
        if(l >= 8 && (hasChar.find() == true) && (hasDigit.find() == true) && (hasSpecial.find() == true)){
        // very strong
            grade = 4;
        }
        return grade;



    }
}
