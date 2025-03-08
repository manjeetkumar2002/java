import java.util.Scanner;
import java.util.ArrayList;
// How to create Multi ArrayList ie matrix
public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialistion 
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>()); // create list and add it 
        }

        // add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt()); // get the list and add elements
            }
        }

        // print the list
        System.out.println(list);
    }
}
