import java.util.Stack;

public class DisplayReverseRecursively {
    public static void displayReverseRec(Stack<Integer> st){
        if(st.isEmpty()) return ;
        int top = st.pop();
        System.out.print(top + " ");
        displayReverseRec(st);
        st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        displayReverseRec(st);
    }
}
