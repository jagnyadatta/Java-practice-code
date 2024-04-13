public class maxSubArray {
    public static void maxSUBarray(int array[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sumSubArray=0;
                for(int k=i;k<=j;k++){
                    //sub array sum
                    sumSubArray+=array[k];
                }
                System.out.println(sumSubArray);
                if(maxSum<sumSubArray){
                    maxSum=sumSubArray;
                }
            }
        }
        System.out.println("Maximum of SubArray is : "+maxSum);
    }
    public static void main(String args[]){
        int array[]={2,4,6,8,10};
        maxSUBarray(array);
    }
}
