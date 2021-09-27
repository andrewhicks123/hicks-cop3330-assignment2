package ex38;
import java.util.*;

public class App {
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<>();
        nums = takeInput();
        //for(int i = 0; i<nums.size();i++){
            //System.out.println(nums.get(i));
        //}
        nums = filterEvenNumbers(nums);
        System.out.println("The even numbers are " + nums.toString().replace("[","").replace("]","").replace(",","") + ".");


    }
    public static List<Integer> filterEvenNumbers(List<Integer> oldArray){
        List<Integer> newArray = new ArrayList<>();
        for(int i = 0; i < oldArray.size(); i++){
            if(oldArray.get(i) % 2 == 0) newArray.add(oldArray.get(i));
        }
        return newArray;
    }


    public static List<Integer> takeInput(){
        Scanner input = new Scanner(System.in);
        String nums = null;
        String[] returns;
        ArrayList<Integer> retur = new ArrayList<>();
        System.out.print("Enter a list of numbers, seperated by spaces: ");
        nums = input.nextLine();
        returns = nums.split(" ");
        for(int i = 0; i < returns.length; i++){
            retur.add(Integer.parseInt(returns[i]));
        }
        return retur;
    }
}
