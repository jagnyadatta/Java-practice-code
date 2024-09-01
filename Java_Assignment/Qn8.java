public class Qn8 {
    public static void main(String[] args) {
        int sum = 0;
        int count = args.length;
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(args[i]); 
            sum += num; 
        }
        
        double average = (double) sum / count;

        // Print the results
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}
