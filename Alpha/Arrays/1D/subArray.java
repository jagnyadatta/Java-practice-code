public class subArray {
    public static void printSubArray(int array[]){
        int totalsub=0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sumSubArray=0;
                for(int k=i;k<=j;k++){
                    System.out.print(array[k]+" ");
                    sumSubArray+=array[k];
                }
                totalsub++;
                System.out.println();
                System.out.print("Sum of subarray : "+sumSubArray);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray is : "+totalsub);
    }
    public static void main(String args[]){
        int array[]={2,4,6,8,10,12};
        printSubArray(array);
    }
}
