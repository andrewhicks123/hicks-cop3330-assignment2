/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */

package ex24;
import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        if(isAnagram(str1,str2))
            System.out.println(str1 + " and " + str2 + " are anagrams.");

        else
            System.out.println(str1 + " and " + str2 + " are not anagrams.");

    }
    static boolean isAnagram(String one, String two){
        String string1 = one.replaceAll("\\s","");
        String string2=  two.replaceAll("\\s","");
        boolean isana = true;
        if (string1.length() != string2.length()) isana = false;
        else{
            char[] String1A = string1.toLowerCase().toCharArray();
            char[] String2A = string2.toLowerCase().toCharArray();
            Arrays.sort(String1A);
            Arrays.sort(String2A);
            isana = Arrays.equals(String1A,String2A);
        }
        return isana;
    }
}
