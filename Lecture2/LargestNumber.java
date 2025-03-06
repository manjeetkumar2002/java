// Largest among three numbers

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Method 1 :-
        // if(a>b&&a>c){
        //     System.out.println(a + " is greater");
        // }
        // else if(b>a&&b>c){
        //     System.out.println(b + " is greater");
        // }
        // else{
        //     System.out.println(c + " is greater");
        // }


        // Method 2 :-
        // int max = a;
        // if(b>max){
        //     max = b;
        // }
        // if(c > max){
        //     max = c;
        // }


        // method 3 :-
        int max = Math.max(c,Math.max(a,b));
       
        System.out.println(max + " is largest number ");
    }
}