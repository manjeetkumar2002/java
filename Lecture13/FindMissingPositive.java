public class FindMissingPositive {
    public static void main(String[] args) {
        int arr[] = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] arr) {
        int index = 0;
        
        while(index<arr.length){
         int correct = arr[index]-1;
         if(arr[index]>0&&arr[index]<=arr.length&&arr[index]!=arr[correct]){
             swap(arr,index,correct);
         }
         else{
             // when the element is at correct position
             index++;
         }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                return i+1;
            }
       }
       return arr.length+1;
    }
    
     static void swap(int[] arr,int first,int second){
         int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
     }
}
