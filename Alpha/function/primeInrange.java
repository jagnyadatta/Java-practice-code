public class primeInrange {
    public static boolean isPrime(int n){
        //corner cases
        if(n==2){
            return true;
        }
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%2==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void primeInrang(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primeInrang(20);
    }
}
