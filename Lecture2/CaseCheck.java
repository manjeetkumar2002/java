import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // char c = in.nextChar();
        // their is no such thing as nextChar();

        char c = in.next().trim().charAt(0); 
        // here we are taking string as input ie first word only , and triming it ie is removing any starting and ending space and only accesing the first character of that string
        if(c>='a'&&c<='z'){
            System.out.println("character is lowercase");
        }
        else{
            System.out.println("character is Uppercase");
        }
    }
}