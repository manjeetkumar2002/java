public class PassingExample{
    public static void main(String[] args){
        String name = "manjeet";
        greet(name); // when this name is pass to this function only the value is passed
        // Note :- Their is no such thing pass by reference in java ,in java their is only pass by value 
    }
    static void greet(String naam){ // naam is another variable which is pointing to the same object "manjeet"
        naam = "kunal"; // naam is now pointing to another object "kunal" ,here we are not changing the object we are creating a new object
        System.out.println(naam);
    }
}