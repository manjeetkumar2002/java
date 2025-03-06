import java.util.*; // Input this package because Scanner class code is present in it
public class InputInJava {
    public static void main(String[] args){
        // Input in java
        Scanner sc = new Scanner(System.in); // Here we are taking input
        String name = sc.nextLine(); //Here we are storing input into the variable , nextLine function take the whole string input
        // for taking only one word of the string use next() method
        System.out.println(name); // system is a class ,println is a method
        // println also print next line
        // print method donot print the next line  
    }
}