import java.util.Scanner;

public class Qn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();

        // Split the number into individual digits
        int digit1 = num / 1000;
        int digit2 = (num / 100) % 10;
        int digit3 = (num / 10) % 10;
        int digit4 = num % 10;

        // I. Sum of all digits of the 4-digit number
        int sumOfDigits = digit1 + digit2 + digit3 + digit4;
        System.out.println("Sum of all digits: " + sumOfDigits);

        // II. Face value and position value of each digit
        System.out.println("Face Value and Position Value:");
        System.out.println("Digit 1: Face Value = " + digit1 + ", Position Value = " + digit1 * 1000);
        System.out.println("Digit 2: Face Value = " + digit2 + ", Position Value = " + digit2 * 100);
        System.out.println("Digit 3: Face Value = " + digit3 + ", Position Value = " + digit3 * 10);
        System.out.println("Digit 4: Face Value = " + digit4 + ", Position Value = " + digit4);

        // III. Value available at position required by user (10, 100, 1000)
        System.out.print("Enter a position (10, 100, 1000): ");
        int position = sc.nextInt();
        int positionValue = (num / position) % 10;
        System.out.println("Value at position " + position + ": " + positionValue);

        // IV. Sum of product of consecutive digits
        int sumOfProductConsecutive = digit4 * digit3 + digit3 * digit2 + digit2 * digit1;
        System.out.println("Sum of product of consecutive digits: " + sumOfProductConsecutive);

        // V. Sum of product of corresponding digits of two 4-digit numbers
        System.out.print("Enter another 4-digit number: ");
        int num2 = sc.nextInt();
        int digit1_2 = num2 / 1000;
        int digit2_2 = (num2 / 100) % 10;
        int digit3_2 = (num2 / 10) % 10;
        int digit4_2 = num2 % 10;
        int sumOfProductCorresponding = digit4 * digit4_2 + digit3 * digit3_2 + digit2 * digit2_2 + digit1 * digit1_2;
        System.out.println("Sum of product of corresponding digits: " + sumOfProductCorresponding);

        // VI. Bitwise AND, OR, and XOR of 2nd and 4th digit
        int andResult = digit2 & digit4;
        int orResult = digit2 | digit4;
        int xorResult = digit2 ^ digit4;
        System.out.println("Bitwise AND of 2nd and 4th digit: " + andResult);
        System.out.println("Bitwise OR of 2nd and 4th digit: " + orResult);
        System.out.println("Bitwise XOR of 2nd and 4th digit: " + xorResult);

        // VII. Left shift, right shift, and zero fill of sum of all digits
        int leftShift = sumOfDigits << digit3;
        int rightShift = sumOfDigits >> digit3;
        int zeroFillRightShift = sumOfDigits >>> digit3;
        System.out.println("Left Shift by 3rd digit: " + leftShift);
        System.out.println("Right Shift by 3rd digit: " + rightShift);
        System.out.println("Zero Fill Right Shift by 3rd digit: " + zeroFillRightShift);

        sc.close();
    }
}

