import java.util.Arrays;
public class SearchIn2DArray{
    public static void main(String[] args){
        int[][] arr = {
            {23,3,4,5},
            {45,56,76,87,85},
            {1,2,65,89},
            {12,54},
        };
        int target = 76;
        int[] ans = search(arr,target); // format of return value {row,col}
        System.out.println(Arrays.toString(ans));
    }
    // returning a array
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col}; // initialising a array and returing it  
                }
            }
        }
        return new int[]{-1,-1};
    }
}