// Q :Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.Scanner;
public class Circle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        circumference(radius);
        area(radius);
    }

    static void circumference(float r){
        double c = 2*3.14*r;
        System.out.println("circumfernce is : "+c);
    }
    static void area(float r){
        double area = 3.14*r*r;
        System.out.println("area is : "+area);
    }

}