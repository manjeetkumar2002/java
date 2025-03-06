// conditional statements and loops

public class Main {
    public static void main(String[] args){
        /*
            syntax of if statement
            if(boolean expressiong T or F){
                // body
            }else{
                // do this
            }
        */

       int salary = 20000;
    //    if(salary>10000){
    //         salary += 2000;
    //    }
    //    else{
    //         salary += 1000;
    //    }

        // multiple if else statements 
        if(salary>20000){
            salary+=3000;
        }
        else if(salary>10000){
            salary+=2000;
        }
        else{
            salary+=1000;
        }
       System.out.println("New salary : "+salary);
    }
}