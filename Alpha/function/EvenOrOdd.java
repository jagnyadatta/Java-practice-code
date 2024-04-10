import java.util.*;

public class EvenOrOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check Even or Odd : ");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
        sc.close();
    }
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
