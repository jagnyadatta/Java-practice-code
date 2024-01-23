import java.util.Scanner;
public class switchCase1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Button");
        int Button = scan.nextInt();

        //Switch Statment started

        switch(Button){
            case 1: System.out.println("Mathematics");
            break;
            case 2: System.out.println("C Language");
            break;
            case 3: System.out.println("Computer Architecture and Organization");           //case 3 executed of button is equal to case 3
            break;
            case 4: System.out.println("Communication English");                            //case 3 executed of button is equal to case 3
            break;
            case 5: System.out.println("Engineering Economics and Accounting");             //case 3 executed of button is equal to case 3
            break;
            default: System.out.println("Invalid Button");   //default case
        }
    }
}
