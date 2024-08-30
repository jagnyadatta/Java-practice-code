/*
 * Write a java program to find greatest among three numbers?
 */
import java.util.Scanner;
public class Qn3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        int greatest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }
        System.out.println("The greatest number is: " + greatest);
        sc.close();
    }
}

