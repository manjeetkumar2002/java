public class Shadowing{
    static int x=200; // this will shadowed at line 5 
    public static void main(String[] args){
        System.out.println(x); // 200
        int x; // the class variable at line 2 is shadowed by this 
//       System.out.println(x); // scope will begin when when is initialised 
        x =40;
        System.out.println(x); //40
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}