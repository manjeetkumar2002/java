import java.util.Scanner;
public class SearchInRange {
    //Q: search for 3 in the range of index [1,4]
    public static void main(String[] args){
       int[] arr = {2,3,5,6,7,8,9,10};
       System.out.println(search(arr,10,1,5));
    }

    static boolean search(int[] arr ,int element,int start,int end){
        // edge case
        if(start>end){
            return false;
        }
        // traverse the array and check each element of array
        for(int i=start;i<=end;i++){
            if(arr[i]==element)
            return true; // return true if you found element
        }

        return false; // return false if element not exist
    }
}
