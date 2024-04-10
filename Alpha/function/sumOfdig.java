import java.util.Scanner;
public class sumOfdig {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer :");
        int num = sc.nextInt();
        int sum = sumOfDigit(num);
        System.out.println("Sum of Digit is "+sum);
        sc.close();
    }
    public static int sumOfDigit(int digit){
        int sumdigit = 0;
        while(digit > 0){
            int rem = digit % 10;
            sumdigit = sumdigit + rem;
            digit = digit / 10;
        }
        return sumdigit;
    }
}
