public class floyd_triangle {
    public static void floydPattern(int n){
        int plus=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(plus+" ");
                plus++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floydPattern(6);
    }
}
