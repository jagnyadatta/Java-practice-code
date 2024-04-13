//pairs in an Array
public class pairsArray {
    //pair method
    public static void printPairs(int Array[]){
        for(int i=0;i<Array.length;i++){
            for(int j=i+1;j<Array.length;j++){
                System.out.print("("+Array[i]+","+Array[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int Array[]={2,4,6,8,10};
        printPairs(Array);
    }
}
