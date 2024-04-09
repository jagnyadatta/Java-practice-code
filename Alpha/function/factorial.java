public class factorial {
    public static int factor(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String args[]){
        int n =5;
        int fact = factor(n);
        System.out.println(fact);
    }
}
