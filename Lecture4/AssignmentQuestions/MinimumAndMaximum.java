// Q :Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;
public class MinimumAndMaximum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("minimum value is :" + minimum(a,b,c));
        System.out.println("maximum value is :" + maximum(a,b,c));
    }
    static int Min(int a,int b){
        if(a>b) return b;
        else return a;
    }
    static int minimum(int a,int b,int c){
        int min = Min(a,Min(b,c));
        return min;
    }
    static int Max(int a,int b){
        if(a>b) return a;
        else return b;
    }
    static int maximum(int a,int b ,int c){
        int max = Max(a,Max(b,c));
        return max;
    }
}