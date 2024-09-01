public class Qn6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int carryIn = 0; 

        // Half Adder result
        System.out.println("Half Adder Result:");
        int sum = a ^ b; 
        int carry = a & b; 
        System.out.println("Half Adder Sum: " + sum);
        System.out.println("Half Adder Carry: " + carry);

        // Full Adder result
        System.out.println("\nFull Adder Result:");
        int firstSum = a ^ b;
        int firstCarry = a & b;

        int finalSum = firstSum ^ carryIn;
        int finalCarry = (firstSum & carryIn) | firstCarry;

        System.out.println("Full Adder Sum: " + finalSum);
        System.out.println("Full Adder Carry: " + finalCarry);
    }
}

