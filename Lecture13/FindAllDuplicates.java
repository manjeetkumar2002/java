import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class FindAllDuplicates {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicates(arr));
    }
    public static List<Integer> findAllDuplicates(int[] arr) {
        int index = 0;
        List<Integer> ans = new ArrayList<>();
        while (index < arr.length) {
                int correct = arr[index] - 1;
                if (arr[index] != arr[correct]) {
                    swap(arr, index, correct);
                }
                else{
                    index++;
                }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
