public class PrintNum{
    //Recursive function 
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);    //recursive function called
    }
    public static void main(String args[]){
        int n = 10;
        printDec(n);
    }
}