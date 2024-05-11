public class lastOccurence {
    public static int lastocc(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastocc(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String args[]){
        int arr[] = {5,3,4,5,8,2};
        int key = 5;
        System.out.println(lastocc(arr, key, 0));
    }
}
