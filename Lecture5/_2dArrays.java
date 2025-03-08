import java.util.Scanner;
import java.util.Arrays;
public class _2dArrays{
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
        /*
            three rows 3 columns
            1 2 3
            4 5 6
            7 8 9
        */

       int[][] arr = new int[3][]; // no need to specify number of columns,you can add it if you want 

        // imagine this as an array of arrays
       int[][] arr1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // individual array can bhi different
        int[][] arr2D = {
            {1,2,3,4}, // 0th index
            {5,6}, // 1st index
            {7,8,9,10,11,21} // 2nd index => arr2D[2] =  {7,8,9,10,11,21}
        };

       // input
        int[][] newArr = new int[3][2];
        System.out.println(newArr.length); // number of rows
        for(int row=0;row<newArr.length;row++){
            // for each col in every row
            for(int col = 0;col<newArr[row].length;col++){
                newArr[row][col] = in.nextInt();
            }
        }

        // output
        //  for(int row=0;row<newArr.length;row++){
        //     // for each col in every row
        //     for(int col = 0;col<newArr[row].length;col++){
        //        System.out.print(newArr[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        // method 2 :-
        for(int row=0;row<newArr.length;row++){
            // for each col in every row
            System.out.println(Arrays.toString(newArr[row]));
        }

        // method 3:-
        // every item in the newArr is an array
        // so datatype should be an array ie int[] a
        for(int[] a:newArr){
            System.out.println(Arrays.toString(a));
        }
    }
}