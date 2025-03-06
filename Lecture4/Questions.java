import java.util.Scanner;
public class Questions {
    public static void main(String[] args){
        // Scanner in = new Scanner(System.in);
        // int num = in.nextInt();
        // isPrime(num);

        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static void isPrime(int num){
        if(num<=1){
            System.out.println(num + " is Not Prime Number!");
            return;
        }
        for(int divisor = 2;divisor*divisor<=num;divisor++){
            if(num%divisor==0){
                System.out.println(num + " is Not Prime Number!");
                return;
            }
        }

        System.out.println(num + " is a Prime Number!");
    }

    // print all the 3 digit armstrong number 
    // example a = 153 => cube(1) +cube(5) +cube(3) => 1 + 125 + 27 => 153 
    // if we get the same value after sum of cube of every digit then it is armstrong number 
    static boolean isArmstrong(int num){
       int original = num;
       int sum = 0;
       while(num>0){
        int rem = num %10;
        sum += rem*rem*rem;
        num/=10;
       }
        return original == sum;
    }
}