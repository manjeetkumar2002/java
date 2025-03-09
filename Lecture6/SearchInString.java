public class SearchInString{
    public static void main(String[] args){
        String name = "kunal";
        char target = 'l';
        System.out.println(search(name,target));
    }
    static int search(String name ,int target){
        // in string length is function, but in array length is variable
        if(name.length() == 0){
            return -1;
        }

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch == target){
                return i;
            }
        }
        return -1;
    }
    static int search1(String name ,int target){
        // in string length is function, but in array length is variable
        if(name.length() == 0){
            return false;
        }

        for(char ch :name.toCharArray()){ // converting name to character array [k,u,n,a,l]
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}