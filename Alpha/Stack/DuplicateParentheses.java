import java.util.Stack;

public class DuplicateParentheses {
    public static boolean checkDuplicateParentheses(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            //for closing
            if(c == ')'){
                int count = 0;
                while(st.pop()!= '('){
                    count++;
                }
                if(count < 1){
                    return true;   //found duplicate
                }
            }else{
                st.push(c);     //push characters into stack
            }
        }
        return false;
    }
    public static void main(String[] args){
        String s1 = "((a+b))";
        String s2 = "(a+b)";

        System.out.println(checkDuplicateParentheses(s1));      //it gives true duplicate exists
        System.out.println(checkDuplicateParentheses(s2));      //it gives false.
    }
}
