// Write a function to find if a number is a palindrome or not. Take number as parameter.
public class CheckNumPalidrome{
    public static void main(String[] args){
        int num = 12321;
        System.out.print(isPalidrome(num));
    }
    static boolean isPalidrome(int num){
        int rev = reverse(num);
        return rev == num;
    }
    static int reverse(int num){
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = (rev*10) +rem;
            num/=10;
        }
        return rev;
    }
}