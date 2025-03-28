// https://leetcode.com/problems/missing-number/description/
import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
       
        System.out.println(sort(arr));
    }
    static int sort(int[] arr){
       int index = 0;
       
       while(index<arr.length){
        int correct = arr[index];
        if(arr[index]<arr.length&&arr[index]!=arr[correct]){
            swap(arr,index,correct);
        }
        else{
            // when the element is at correct position
            index++;
        }
       }

       // after the sorting , check for the missing element
       for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i){
                return i;
            }
       }
       return arr.length; // case when N is missing 
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
