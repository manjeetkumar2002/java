import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students : {roll nos , name , marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student kunal;
        kunal = new Student();
        
        System.out.println(Arrays.toString(students));
        System.out.println(kunal); // gives you random values

        Student manjeet = new Student();
        System.out.println(manjeet.rno); // it give by default 0
        System.out.println(manjeet.name); // it give by default null
        System.out.println(manjeet.marks); // it give by default 0.0

        // lets give them values
        manjeet.name="Manjeet Kumar";
        manjeet.rno=9;
        manjeet.marks=100;
        System.out.println(manjeet.name);
        System.out.println(manjeet.rno);
        System.out.println(manjeet.marks);

        // when a non primitive is final , you can't reassign it 
        final Student karan = new Student();
        karan.name = "Karan"; // you can changed
        System.out.println(karan.name);

        // karan = manjeet; //cannot assign a value to final variable karan
    }
}

// create a class
// for every single student 
class Student {
    int rno;
    String name;
    float marks = 90; // default value of marks
}