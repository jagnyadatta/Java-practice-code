public class solidRhombus {
    public static void solidRhombusPattern(int n){
        int count = n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(count-1);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            count--;
            System.out.println();
        }
    }
    public static void main(String args[]){
        solidRhombusPattern(5);
    }
}