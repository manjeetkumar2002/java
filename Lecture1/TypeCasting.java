import java.util.*;
public class TypeCasting {
    public static void main(String[] args){
        // Typecasting :- when one type of data is assign to another type of variable then 
        // automatically type conversion will take place , if the following condition are met 
        // Condition1 :- the two type should be compatible 
        // condition2 :- the left hand side value should be greater then right hand side value (it means agar ham choti chij me badi chij ko daalenge to error milega , it will not work)
        // 

        // for example :-
        Scanner input = new Scanner(System.in);
        // float num = input.nextInt();
        // System.out.println(num);
        // input  43 => 43.0 convert to float

        // How to convert float to int :- compressing the bigger data type to smaller datatype this is called explicit conversion 
        // int num = (int)(54.767);
        // System.out.println(num); // output :- 54

        // automatic type promotion in expression 
        // int a = 257;
        // byte b = (byte)(a); // 257 % 256 = 1
        // System.out.println(b); // 1

        // byte a = 40 ;
        // byte b = 50 ;
        // byte c = 100 ;
        // int d = (a*b)/c; // 40*50 == 2000 => 2000 /100 =>20 // here 2000 is exceeds the range of the byte here java automatically promoting it to the int
        // System.out.println(d); //20


        // byte e = 30;
        // e = e * 2; // here this will give error here we are storing int to a byte 

        // int number = 'a';
        // System.out.println(number); // it convert a to 97


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (f / c) - (d - s); // b is promiting to float , c is promiting to int , s convert to double 
        // result  = float + int - double = double 
        // f*b = 238.14
        // f/c = 0.0584536082474227
        // d-s = -1,023.8766
        System.out.println(result); //1,262.075053608247
    }
}