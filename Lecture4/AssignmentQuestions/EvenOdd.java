// Q :Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        check(num);
    }
    static void check(int num){
        if(num%2==0)
        System.out.println("Number is Even");
        else 
        System.out.println("Number is Odd");
    }
}