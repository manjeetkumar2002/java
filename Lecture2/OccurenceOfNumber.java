// Suppose we are given n = 1385757879 ,Count the number of 7s in this number 

public class OccurenceOfNumber {
    public static void main(String[] args){
        int n = 1385757879;
        int count = 0;
        
        while(n>0){
            int rem = n % 10; // last digit 
            if(rem == 7){
                count++;
            }
            n = n / 10;
        }
        System.out.println("Count of 7 is " + count);
    }
}
