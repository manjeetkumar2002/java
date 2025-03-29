import java.util.Arrays;
public class SetMismatch {
    public static void main(String[] args) {
        int nums[] = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int index = 0;
        while(index<nums.length){
            int correct = nums[index]-1;
            if(nums[index]!=nums[correct]){
                swap(nums,index,correct);
            }
            else{
                index++;
            }
        } 
        
        // find the missing and repeating Number
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                
                return new int[] {nums[i],i+1}; // [repeating ,missing]
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
