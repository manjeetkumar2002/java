public class FiboSeries{
    public static void main(String[] args){
        //Q. Find the nth fibonacci number
        int a = 0;
        int b = 1;
        int n = 7; 
        int next = 0;
        // 0 1 1 2 3 5 8 
        for(int i = 3;i<=n;i++){
            next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Nth number is " + next);
    }
}