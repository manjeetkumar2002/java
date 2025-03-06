import java.util.Scanner;
public class Sum{

    public static void main(String[] args){
       //sum(); // calling the function 
    
        // int ans = sum2();
        // System.out.println("Sum is : "+ans);

        int ans = sum3(6,4);
        System.out.println("sum is :" + ans);
    }
    // we will see later why we write static
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter first number : ");
        num1 = in.nextInt();
        System.out.print("Enter second number : ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.print("sum is : " + sum);
    }
    // return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter first number : ");
        num1 = in.nextInt();
        System.out.print("Enter second number : ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
       // System.out.println("This statement will never execute");
    }
    // pass the value of numbers when you are calling the method in main()

    static int sum3(int x,int y){
        int sum = x+y;
        return sum;
    }
     /* 
            syntax of function :-

            access modifier return_type name (arguments){
                // body
                return statement;
            }

    */
}