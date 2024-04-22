public class bubbleSort{
    public static void Bubble_sort(int arr[]){
        for(int turn=0;turn<=arr.length-2;turn++){
            for(int j=0;j<=arr.length-2-turn;j++){
                if(arr[j]>arr[j+1])
                {
                    //Swapping 
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
     public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        Bubble_sort(arr);
        printArr(arr);
     }
}