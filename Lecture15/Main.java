public class Main{
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern28(5);
        // pattern30(5);
        // pattern17(5);
        // pattern31(4);
        // pattern6(5);
        pattern7(5);

    }
    public static void pattern1(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
        
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
      
    }
    public static void pattern6(int n){
        for (int row = 1; row <=n; row++) {
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for (int row = 1; row <=n; row++) {
            for(int space=1;space<=row-1;space++){
                System.out.print(" ");
            }
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces =n-totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
        
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern30(int n){

        for (int row = 1; row <=n; row++) {
            int noOfSpaces = n - row;
            for(int s=1;s<=noOfSpaces;s++){
                System.out.print("  ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for(int col =2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){

        for (int row = 1; row <= 2*n ; row++) {
            int c = row>n? 2*n - row : row;
            int noOfSpaces = n-c;
            for(int s=1;s<=noOfSpaces;s++){
                System.out.print("  ");
            }
            for (int col = c; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for(int col =2;col<=c;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern31(int n){
        n=n*2;
        for (int row = 0; row <=n ; row++) {
           for (int col = 0; col <=n; col++) {
                int atEveryIndex =Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex);
           }
           System.out.println();
        }
    }

}