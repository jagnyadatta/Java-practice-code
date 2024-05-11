public class powerofN {
    public static int power(int x,int pow){
        if(pow == 0){
            return 1;
        }
        return x * power(x,pow-1);
    }

    public static void main(String args[]){
        int x = 5;
        int pow = 4;
        System.out.println(power(x, pow));
    }
}
