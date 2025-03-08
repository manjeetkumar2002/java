import java.util.Scanner;
import java.util.Arrays;
public class Input{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // array of primitive
        int[] arr = new int[5];
        arr[0] = 20;
        arr[1] = 40;
        arr[2] = 50;
        arr[3] = 60;
        arr[4] = 80;
        //[20,40,50,60,80]
        System.out.println(arr[0]);
        System.out.println(arr[3]);

        // Input using for loop 
        // arr.length give the length of the array
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        // output the array
        //  for(int i=0;i<arr.length;i++){
        //    System.out.print(arr[i]+ " ");
        // }

        // using for each loop
        for(int num : arr){ // for every element in array , print the element
            System.out.print(num+ " "); // here num represent element of the array
        }

       //System.out.println(arr[5]); // index out of bound error ,Index 5 out of bounds for length 5

       System.out.println(Arrays.toString(arr)); // it convert the array to string  [1, 2, 3, 4, 5]


       // array of objects
        String[] str = new String[5];
        for(int i=0;i<str.length;i++){
            str[i] = in.next();
        }

        // for(int i=0;i<str.length;i++){
        //     System.out.print(str[i]+" ");
        // }
         System.out.println(Arrays.toString(str));

        for(String element : str){
            System.out.println(element);
        }
    }
}