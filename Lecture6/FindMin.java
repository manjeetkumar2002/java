import java.util.Scanner;
public class FindMin {
    public static void main(String[] args){
        int[] arr = {1,3,4,-1,2,-5};
        System.out.println(minimumElement(arr));
    }

    
    static int minimumElement(int[] arr){
        int minVal = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minVal){
                minVal=arr[i];
            }
        }
        return minVal;
    }
}