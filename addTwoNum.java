import java.util.*;      //java package
public class addTwoNum{
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Two Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();            //scanner close
        int sum = a + b;
        System.out.println(sum);
        
    }
}