import java.util.Scanner;
class SwitchInJava {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruits = in.next();
        // using if else
        // if(fruits.equals("mango")){
        //     System.out.println("king of fruit");
        // }
        // else if(fruits.equals("apple")){
        //     System.out.println("a sweet red fruit");
        // }

        // switch(fruits){
        //     case "mango" : System.out.println("king of fruit");
        //     break;
        //     case "apple" : System.out.println("a sweet red fruit");
        //     break;
        //     case  "orange" : System.out.println("a round fruit"); 
        //     break;
        //     case  "graphes" : System.out.println("a small fruit"); 
        //     break;
        //     default : System.out.println("check for another fruit");
        // }

        switch(fruits){
            case "mango" -> System.out.println("king of fruit");
            case "apple" -> System.out.println("a sweet red fruit");
            case "orange" -> System.out.println("a round fruit"); 
            case "graphes" ->  System.out.println("a small fruit");
            default -> System.out.println("check for another fruit");
        }

        int day = in.nextInt();
        switch(day){
            case 1,2,3,4,5 ->System.out.println("weekday");
            case 6,7 ->System.out.println("weekend");
        }
    }
}