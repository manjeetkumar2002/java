import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        float number = input.nextFloat();
        if(number%2==0){
            System.out.print("Number is Even");
        }
        else{
            System.out.print("Number is Odd");
        }
    }
}