// finalized() method  is used what you want to do when object is destroyed by garabage collector 
public class Finalised {
    public static void main(String[] args) {
        Student obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new Student("random name");
        }
    }
}

class Student{
    String name;

    Student(String name){
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed"); // what to do when memory is freed
    };
}