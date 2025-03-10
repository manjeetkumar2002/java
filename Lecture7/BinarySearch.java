public class BinarySearch{
    public static void main(String[] args){
        // Q : Binary is search techique used to search element in the sorted array 
        int[] arr = {1,2,4,5,6,7};
        int index = binary_search(arr,6);
        System.out.println(index);
    }
    // return the index 
    // return -1 , if it does not exist
    static int binary_search(int[] arr,int key){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            // find the middle element 
            // int mid = (start + end) / 2; // might be possible that (start + end)exceeds the range of int
            int mid = start + (end - start)/2;
            if(arr[mid]==key){ // ans found
                return mid;
            }
            // if target less then middle search on left side 
            else if(key<arr[mid]){
                end = mid - 1;
            }
              // if target greater then middle search on right side 
            else if(key>arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }

   
}