import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        sc.close();
        if (button == 1)
        {
            System.out.println("Hello");
        }
        else if (button == 2)
        {
            System.out.println("Namaste");
        }
        else if(button == 3)
        {
            System.out.println("Bonjour");
        }
        else if(button == 4)
        {
            System.out.println("Hii");
        }
        else
        {
            System.out.println("Invalid Button");
        }
    }
}
