import java.util.ArrayList;
import java.util.Scanner;
public class list{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // it is similar to vector , when you don't want to create fixed size array

        // syntax 
        ArrayList<Integer> list  = new ArrayList<>(10); // initial capacity 10

        list.add(20);
        list.add(45);
        list.add(65);
        list.add(87);
        list.add(874);
        list.add(45);
        list.add(65);
        list.add(87);
        list.add(874);
        list.add(45);
        list.add(65);
        list.add(87);
        list.add(874);
        list.add(8768);

        System.out.println(list.contains(8768)); // does it contain this element
        list.set(0,6565777);// 0th index is updated
        list.remove(4); // remove the 4th index element
        System.out.println(list);

        // input 
        for(int i=0;i<2;i++){
            list.add(in.nextInt());
        }

        // get item at any index 
        for(int i = 0;i<5;i++){
            System.out.println(list.get(i)); // pass index here ,list[index] syntax will not work here
        }

        System.out.println(list);

    }
}