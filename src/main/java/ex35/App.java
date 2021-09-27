/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Andrew Hicks
 */

package ex35;
import java.util.*;

public class App {
    public static void main(String args[]){

        ArrayList<String> names = new ArrayList<>();
        names = takeInput();
        int winner = getRandom(names.size());
        System.out.println("The winner is... " + names.get(winner));
    }
    public static ArrayList<String> takeInput(){
        String name = null;
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        do{
            System.out.print("Enter a name: ");
            name = input.nextLine();
            if(!name.isBlank() && !name.isEmpty()){
                names.add(name);
            }
        }while(!name.isBlank() && !name.isEmpty());

        return names;
    }
    public static int getRandom(int l){
        Random random = new Random();
        return random.nextInt(l);
    }
}
