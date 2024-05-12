public class TilingPlate {
    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        //vertically
        int fnm1 = tilingProblem(n-1);

        //Horizontally
        int fnm2 = tilingProblem(n-2);
        //total Way
        int totalWay = fnm1 + fnm2;
        return totalWay;
    }
    public static void main(String args[]){
        System.out.println(tilingProblem(3));
    }
}