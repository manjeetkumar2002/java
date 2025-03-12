// Order agnostic Binary search :- when we don't know array is in which order
public class OrderAgnosticBS{
    public static void main(String[] args){
        // int[] arr = {1,2,4,5,6,7};
        int[] arr = {9,3,2,-1,-3,-6,-8};
        int index = orderAgnosticBS(arr,-8);
        System.out.println(index);
    }

    static int orderAgnosticBS(int[] arr ,int target){
        int start = 0;
        int end = arr.length - 1;

        // check whether the arr is ascending or descending order
        // check first with last element , if it is less then the arr is ascending 
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]== target){
                return mid;
            }
            // steps when array is ascending order
            if(isAsc){
                if(target<arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            // steps when array is descending order
            else{
                if(target<arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}