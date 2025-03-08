class Arrays{
    public static void main(String[] args){
        //Q : store a roll number 
        int a = 19;

        //Q : store a person's name 
        String name = "Manjeet kumar";

        //Q : store 5 roll numbers
        int rno1 = 23;
        int rno2 = 43;
        int rno3 = 54;
        int rno4 = 34;
        int rno5 = 45;

        // syntax of declaring array
        // datatype[] variable_name = new datatype[size];
        
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = {23,45,65,76,87};
        //1. all the elements in the arrays should be of same type 


        int[] ros; // declaration of array . ros is getting defined in the stack
        ros = new int[5]; // initialisation :actually here object is being created in the heap

        System.out.println(ros[2]); // all elements are zeros by default

        String[] arr = new String[4];
        System.out.println(arr[2]); // null 

        String str = null; 
        // int num = null; error
    }
}