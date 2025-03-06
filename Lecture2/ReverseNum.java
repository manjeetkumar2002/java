public class ReverseNum {
    public static void main(String[] args){
        int n = 4201;
        int reverse = 0;
        while(n>0){
            int rem = n % 10; // last digit 
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
