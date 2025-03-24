import java.util.*;
public class SelectionSort {
   public static void main(String[] args) {
        int[] arr = {34,12,-24,-54,0,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
   } 
   static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = findMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
   }
   static int findMaxIndex(int[] arr,int start ,int end){
        int max = 0;
        for (int i = start; i <= end; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
   }
   static void swap(int arr[] ,int first,int second){
    int temp = arr[first];
    arr[first]=arr[second];
    arr[second] = temp;
   }
}
