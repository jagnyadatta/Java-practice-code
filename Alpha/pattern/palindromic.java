public class palindromic {
    public static void palindromicPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for descending number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // for ascending number
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        palindromicPattern(5);
    }
}
