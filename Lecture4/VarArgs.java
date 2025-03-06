// variable argumnets are those when we don't know the number of argument we are passing the method 
import java.util.Arrays;
public class VarArgs{
    public static void main(String[] args){
        fun(1,3,4,5,6);
        multiple(2,4,"kunal","manjeet","amit");
    }
    static void multiple(int a,int b ,String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a);
        System.out.println(b);
    }
    static void fun(int ...v){ // this will take those numbers as array of int
        System.out.println(Arrays.toString(v));
    }
}