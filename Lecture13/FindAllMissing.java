// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1589106605/
// Ask in google
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class FindAllMissing {
    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
       
        System.out.println(findDisapperedNumbers(arr));
    }
    static List<Integer> findDisapperedNumbers(int[] arr){
        int index = 0;
        
        while(index<arr.length){
         int correct = arr[index]-1;
         if(arr[index]!=arr[correct]){
             swap(arr,index,correct);
         }
         else{
             // when the element is at correct position
             index++;
         }
        }

        // just find the missing numbers 
        List<Integer> ans = new ArrayList<>();
        for (index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                // arr[index]+1 is missing
                ans.add(index+1);
            }
        }
        return ans;
     }
    static void swap(int[] arr,int first,int second){
         int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
     }
}
