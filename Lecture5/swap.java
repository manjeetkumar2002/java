import java.util.Arrays;
public class swap {
    public static void main(String[] args) {
        // Q : swap elements of index1 and index2 
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2] = temp;
    }    
}
