import java.util.Arrays;
public class MaxIn2DArray{
    public static void main(String[] args){
        int[][] arr = {
            {23,3,4,5},
            {45,56,76,87,85},
            {1,2,65,89},
            {12,54},
        };
        System.out.println(Max(arr));
    }

    static int Max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                   max=arr[row][col];
                }
            }
        }
        return max;
    }
}