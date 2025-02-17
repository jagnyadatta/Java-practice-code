import java.util.Stack;

public class PostfixToValue {
    public static int postFixToValue(String postfix){
        Stack<Integer> val = new Stack<>();
        for(int i = 0; i<postfix.length(); i++){
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <=57){
                val.push(ascii-48);
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = val.pop();
                int v1 = val.pop();
                if(ch == '+') val.push(v1+v2);
                if(ch == '-') val.push(v1-v2);
                if(ch == '*') val.push(v1*v2);
                if(ch == '/') val.push(v1/v2);
            }
        }
        return val.pop();
    }
    public static void main(String[] args){
        String postfix = "953+4*6/-";
        int val = postFixToValue(postfix);
        System.out.println(val);
    }
}
