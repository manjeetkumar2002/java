import java.util.Scanner;
import java.util.Arrays;
public class PassingInFunction{
    public static void main(String[] args){
        int[] nums = {12,43,54,55};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums)); 
        // mutable behaviour 
        // we can change arrays values , but we can make change in String 
    }
    static void change(int[] arr){
        arr[0]=100;
    }
}