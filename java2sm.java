import java.util.Scanner;

public class java2sm {
    public static void main(String[] args) {
        System.out.println("Enter Your name :");
        Scanner sc = new Scanner(System.in);
        System.out.println("You Entered :"+sc);
        Scanner sp = new Scanner(System.in);
        System.out.println("You Entered :"+sp);

        sc.close();
        sp.close();
    }
}
