import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);44
        int[] arr = new int[8];
        // input
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        //searching 
        int element = in.nextInt();
        boolean bool = search(arr,element);
        if(bool==true)
            System.out.println("Element is found !");
        else    
            System.out.println("Element is not found !");
    }

    static boolean search(int[] arr ,int element){
        // traverse the array and check each element of array
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element)
            return true; // return true if you found element
        }

        return false; // return false if element not exist
    }
}

// Time complexity : in best case O(1) , in worst case O(n) , n is size of array