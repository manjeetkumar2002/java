import java.util.Arrays;
public class Max {
    public static void main(String[] args) {
        // Q : find max element
        int[] arr = {1,2,3,4,5};
        System.out.println(Max(arr));
        System.out.println(MaxInRange(arr,1,3));
    }
    static int Max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }    
    static int MaxInRange(int[] arr,int r1,int r2){
        // edge case
        if(r2<r1||arr==null){
            return -1;
        }
        int maxVal = Integer.MIN_VALUE;
        for (int i = r1; i <=r2; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
