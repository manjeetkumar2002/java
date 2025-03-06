import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Take input principal , rate , time 
        System.out.println("Enter the Principal , time , rate : ");
        float principal = in.nextFloat();
        float time = in.nextFloat();
        float rate = in.nextFloat();
        float SI = (principal * rate * time) / 100;
        System.out.print("Simple Interest is :" + SI);

    }
}