public class deciTobin {
    public static void deciToBin(int DeciNum){
        int oldDeci = DeciNum;
        int rem = 0;
        int bin = 0;
        int power =0;
        while(DeciNum>0){
            rem = DeciNum % 2;
            bin = bin + rem * (int)Math.pow(10,power);
            power++;
            DeciNum = DeciNum/2;
        }
        System.out.println("Binary of "+oldDeci+" = "+bin);
    }
    public static void main(String args[]){
        deciToBin(5);
    }
}
