public class BintoDeci {
    public static void binToDeci(int binNum){
        int pow = 0;
        int decNum = 0;
        int oldBin = binNum;
        while(binNum > 0){
            int l_digit = binNum % 10;
            decNum = decNum + (l_digit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of "+oldBin+" = "+decNum);
    }
    public static void main(String args[]){
        binToDeci(121);
    }
}
