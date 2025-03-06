import java.util.Arrays;
public class ChangeValueExample{
    public static void main(String[] args){
        // create an array 
        int[] arr = {1,3,2,45,6};
        change(arr); // reference copy is passed
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){ 
        nums[0] = 99; // nums also changed the original arr
        // if you make a change to the object via this ref variable, same object will be change 
    }
}