// Q :A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;
public class EligibleToVote {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        checkEligibility(age);
    }
    static void checkEligibility(int age){
        if(age>=18){
            System.out.println("He/She is eligible to vote");
        }else{
            System.out.println("He/She is not eligible to vote");
        }
    }
}