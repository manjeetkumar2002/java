import java.util.Scanner;
public class functionInJava{
    public static void main(String[] args){
        //Q : take input of 2 numbers and print the sum 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = in.nextInt();
        System.out.print("Enter second number :");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("sum is : " + sum);
        // do this 10 times , then it is complext task and also create redundancy 
    }
}