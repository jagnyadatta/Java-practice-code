public class optimizedPower {
    public static int oPower(int a , int pow){
        if(pow == 0){
            return 1;
        }
        int halfPow = oPower(a, pow/2) * oPower(a, pow/2);
        if(pow % 2 != 0){
            halfPow = a * halfPow;
        }
        return halfPow;
    }
    public static void main(String args[]){
        int a = 5;
        int pow = 4;
        System.out.println(oPower(a, pow));
    }
}
