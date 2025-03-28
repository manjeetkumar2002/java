// https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }

    static int findDuplicate(int[] arr) {
        int index = 0;

        while (index < arr.length) {
            if (arr[index] != index + 1) {
                int correct = arr[index] - 1;
                if (arr[index] != arr[correct]) {
                    swap(arr, index, correct);
                }
                else{
                    return arr[index];
                }
            }
            else {
                // when the element is at correct position
                index++;
            }
        }

        return -1;// when no element is repeating
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
