public class getLargest {
    public static int getLarge(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[]={1,2,5,8,3};
        System.out.println("Largest number is :"+getLarge(numbers));
    }
}
