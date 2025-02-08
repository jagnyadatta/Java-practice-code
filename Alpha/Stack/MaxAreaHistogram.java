import java.util.Stack;

public class MaxAreaHistogram {
    public static int maxArea(int[] arr){
        int area = 0;
        int[] nsl = new int[arr.length];
        int[] nsr = new int[arr.length];
        //for next smaller right
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = st.peek();
            }
            st.push(i);
        }

        //for next smaller left
        st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }

        //find area
        //current width = j - i - 1 = nsr[i] - nsl[i] - 1
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            area = Math.max(area, width*height);
        }
        return area;
    }   
    public static void main(String[] args){
        int[] heights = {2,1,5,6,2,3};
        int area = maxArea(heights);
        System.out.println("Maximum Area of Histogram : "+area);
    }
}
