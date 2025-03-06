public class Swap{
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        swap(a,b); // these values are not swap because they are pass by values
        System.out.println(a + " " + b);

        String name = "Manjeet";
        changeName(name); // name also not changed because it is pass by value
        System.out.println(name);
    }
    static void changeName(String name){
        name = "Amit";
    }
    static void swap(int a,int b){
        // swap numbers code 
        int temp = a;
        a = b;
        b = temp;
        // this change will only valid in this function scope only 
    }
}