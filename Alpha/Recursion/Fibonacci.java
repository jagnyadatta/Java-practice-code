public class Fibonacci {
    public static int fibn(int n)
    {
        if( n == 0 || n == 1){
            return 1;
        }
        int fib1 = fibn(n-1);
        int fib2 = fibn(n-2);
        int fn = fib1 + fib2;
        return fn;
    }

    public static void main(String args[]){
        int n = 4;
        System.out.println(fibn(n));
    }
}
