/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */



package ex37;
import java.util.*;

public class App {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int length = input.nextInt();
        System.out.print("How many special characters? ");
        int special = input.nextInt();
        System.out.print("How many numbers? ");
        int nums = input.nextInt();
        System.out.println("Your password is " + passwordGenerator.generatePassword(length,special,nums));
    }
}


class passwordGenerator {
    public static String generatePassword(int length, int special, int nums){
        Character[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','q','q','r','s','t','u','v','w','x','y','z'};
        Character[] specialChar = {'!','@','#','$','%','^','&','*','"'};
        Character[] num = {'1','2','3','4','5','6','7','8','9'};
        List<Character> letter = Arrays.asList(letters);
        List<Character> specialc = Arrays.asList(specialChar);
        List<Character> number = Arrays.asList(num);
        Random random = new Random();
        ArrayList<Character> pass = new ArrayList<>();

        for(int i = 0; i < special; i++){
            pass.add(specialc.get( random.nextInt( specialc.size() )));
        }
        for(int i = 0; i < nums; i++){
            pass.add(number.get( random.nextInt( number.size() )));
        }
        for(int i = pass.size(); i < length; i++){
            pass.add(letter.get( random.nextInt( letter.size() )));
        }
        Collections.shuffle(pass);
        String password = "";
        for(Character s: pass){
            password += Character.toString(s);
        }
        return password;
    }
}
