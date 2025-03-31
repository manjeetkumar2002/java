
public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student("kunal",9,90.0f);
        Student student2 = new Student();
        System.out.println(student1.name);
        System.out.println(student2.name);

        student1.greeting();
        student1.greeting("manjeet");

        Student random = new Student(student1);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);



        // two variable points to same object
        Student s1 = new Student("karan",34,54.6f);
        Student s2 = s1;
        s2.name = "ranjan";
        System.out.println(s1.name); // s2 changed the name of s1 , it is because both pointing to same 
    }
}
class Student {
    int rno;
    String name;
    float marks = 90; // default value of marks
    // default constructor here Student is return type but this function have no name
    // constructor is a special function 
    Student(){
        // rno = 0;
        // name = null;
        // marks= 0.0f;

        // this is how you can call a contructor from another constructor
        // internally : new Student(100,"default person" ,90.0f);
        this ("default person",100 ,90.0f);
    }
    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    // parameterised constructor 
    // Student arpit = new Student(12,"Arpit",43.54f);
    // here , this will be replaced with arpit
    Student(String name,int rno,float marks){
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }


    void greeting(){
        System.out.println("My name is " + name);
    }

    void greeting(String name){
        System.out.println("Hello "+name+" I am " +this.name);
    }

    void changeName(String newName){
        name = newName;
    }
}