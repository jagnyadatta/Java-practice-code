/*
 * binary_search
 */
public class binary_search {
    public static int binarySearch(int numbers[],int key){
        int start=0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //comparision
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){   //left case
                end = mid-1;
            }
            else{                   //right case
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]= {2,4,6,8,10,12,14};
        int key=14;
        System.out.println("Index number of key : "+binarySearch(numbers, key));
    }
    
}