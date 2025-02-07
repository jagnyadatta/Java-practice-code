import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > s.peek()){
                res[i-1] = arr[i];
            }else{
                res[i-1] = -1;
            }
            s.push(arr[i]);
        }
        res[arr.length-1] = -1;
        return res;
    }
    public static void main(String[] args){
        int[] arr = {6,8,0,1,3};
        int[] nextG = nextGreaterElement(arr);
        
        for(int i : nextG){
            System.out.print(i + " ");
        }
    }
}
