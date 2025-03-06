import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        float first_number = sc.nextFloat();
        System.out.print("Enter the Second Number : ");
        float second_number = sc.nextFloat();
        float sum = first_number + second_number;
        System.out.print("The sum is " + sum);
    }
}