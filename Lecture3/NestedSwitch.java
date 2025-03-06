import java.util.Scanner;
class NestedSwitch{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String deparment = in.next();

        switch(empId){
            case 1 : System.out.println("manjeet");
                break;
            case 2 : System.out.println("manjeet");
                break;
            case 3 : System.out.println("manjeet");
                break;
            case 4 : System.out.println("Employee number 4");
                switch(deparment){
                    case "IT" : System.out.println("IT departement");
                    break;
                    case "Management" : System.out.println("management departement");
                    break;
                    default : System.out.println("Enter a valid department");
                }
            break;
            default : System.out.println("Enter a valid id");
        }
    }
}