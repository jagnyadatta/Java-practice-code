import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Button");
        int Button = scan.nextInt();

        //Switch Statment started

        switch(Button){
            case 1: System.out.println("HELLO");
            break;
            case 2: System.out.println("Bounjure");
            break;
            case 3: System.out.println("Namaste");           //case 3 executed of button is equal to case 3
            break;
            default: System.out.println("Invalid Button");   //default case
        }
    }
}
