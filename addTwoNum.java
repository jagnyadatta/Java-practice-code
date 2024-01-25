import java.util.*;
public class addTwoNum{
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Two Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = a + b;
        System.out.println(sum);
        
    }
}