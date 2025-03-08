// Q :Write a program to print the sum of two numbers entered by user by defining your own method.
// Q :Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;
class Arithmetic{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = sum(num1,num2);
        System.out.println("sum of "+num1 +" and "+num2+" is "+ans);
        ans = product(num1,num2);
        System.out.println("product of "+num1 +" and "+num2+" is "+ans);
    }
    static int product(int a,int b){
        return a*b;
    }
    static int sum(int a,int b){
        return a+b;
    }
}