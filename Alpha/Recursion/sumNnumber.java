public class sumNnumber {
    public static int sum(int n){
        int sum = 0;
        if(n == 1){
            return 1;
        }
        sum = n + sum(n-1);
        return sum;
    }
    public static void main(String args[])
    {
        int n = 3;
        System.out.println(sum(n));
    }
}
