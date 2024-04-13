public class prfxMaxSBarr {
    public static void prfixMxSBarray(int array[]){
        int sumSubArray=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[array.length];

        prefix[0]=array[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }

        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                sumSubArray= (i==0?prefix[j]:prefix[j]-prefix[i-1]);
                if(maxSum<sumSubArray){
                    maxSum=sumSubArray;
                }
            }
        }
        System.out.println("Maximum of SubArray is : "+maxSum);
    }
    public static void main(String args[]){
        int array[]={2,4,6,8,10};
        prfixMxSBarray(array);
    }
}
