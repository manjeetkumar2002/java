public class WrapperExample {
    public static void main(String[] args) {
        // you can create primitives also with wrapper class , here they are created as a object 
        Integer a = 10;
        Integer b = 20;
        // Integer num = new Integer(20);
        Integer num = 34; // Integer is a wrapper class
       // num.toString(); // you can call its method
        System.out.println(num);
        swap(a,b);
        System.out.println(a+" "+b); // not swapped ,because Integer is a final class , you can't modified it 

        final int SIZE =43;
        // size =35; // cannot assign a value to final variable size
        System.out.println(SIZE);
 
        // NOTE : if you are making a object to be a final then its reference will not changed but you can change its properties
        
    }
    static void swap(Integer a,Integer b){
        // when you pass the object it reference is passed , because they are reference variable
        // they are not swapped because this variable are created using final keyword , you can't modify them
        Integer temp = a;
        a = b;
        b = a;
    }
}

public class A {
    // make the final variable capital , it is a convention 
    final int INCREASE = 34; // always initialise the final variable while declaring it ,otherwise it give error
}