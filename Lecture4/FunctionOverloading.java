import java.util.Arrays;
public class FunctionOverloading{
    public static void main(String[] args){
        fun(3);
        fun("manjeet");

        System.out.println(sum(3,5));
        System.out.println(sum(3,5,6));

        demo(2,4,5,6);
        demo("amit","manjeet");
        //demo(); //error : reference to demo is ambiguous
    }

    static void fun(int n){
        System.out.println(n);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}