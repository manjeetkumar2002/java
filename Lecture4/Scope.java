public class Scope{
    public static void main(String[] args){
        int a = 10;
        // System.out.println(num);
        // can't access local variable of another function


        {
           // int a = 34; // already initialised outside the block in the same method , hence you cannot initialise again ,but you can change it as a =35;
           a = 100; // reassign the origin ref variable to same other value
            int c =34;
            // values initialised in this block , will remain in block
        }
        System.out.println(a);
        //System.out.println(c); // cannot use outside the block


        // scoping in for loops 
        for(int i =0;i<4;i++){
            System.out.println(i);
            a = 10000;
        }
        //System.out.println(i); // can't use outside 
        System.out.println(a);  
    }

    static void random(int marks){
        int num = 10;
        System.out.println(num);
        System.out.println(marks); // marks is local to this function
    }
}