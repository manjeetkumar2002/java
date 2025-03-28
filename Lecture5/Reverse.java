import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        // Q : Reverse this array
        int[] arr = {1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        // This is two pointer method 
        int start = 0;
        int end = arr.length - 1;
        while (start<end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2] = temp;
    }    
}
