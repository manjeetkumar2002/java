import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        
        
        /* 
        
            
            for(intialisation; condition;increment/decrement){
                // body
            }
        
        
        */

       //Q. print numbers form 1 to 5

        for(int num = 1; num<=5;num++){
            System.out.println(num);
        }


        // Q. print numbers from 1 to n using while loop
        /*  syntax of while loop
            initialisation
            while(condition){
                // body
                // increment/decrement
            }
        
        */
        Scanner in = new Scanner(System.in);
        int num = 1;
        int n = in.nextInt();
        while(num<=n){
            System.out.print(num + " ");
            num++;
        }
        // when you don't know how many time the loop execute then uses while otherwise for loop

        /*
        
            do while loop syntax :-

            do{
            }while(condition);
        */
        n = 1;
       do{
        System.out.println(n);
        n++;
       }while(n<=5);
    }
}