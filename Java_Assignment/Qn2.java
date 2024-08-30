/*
 * Write a java program to find simple interest?
 */
import java.util.Scanner;
public class Qn2 {
    public static void main(String[] args) {
        double principal;
        double rate;
        double time;
        double simpleInterest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount: ");
        principal = sc.nextDouble();
        System.out.println("Enter the Rate of interest (%): ");
        rate = sc.nextDouble();
        System.out.println("Enter the Time period (in years): ");
        time = sc.nextDouble();
        simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
        sc.close();
    }
}
