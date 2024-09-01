public class Qn7 {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]); 
            
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the results
        System.out.println("Total number of even numbers: " + evenCount);
        System.out.println("Total number of odd numbers: " + oddCount);
    }
}

