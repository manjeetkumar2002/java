import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,7,1,3,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
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
       
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}