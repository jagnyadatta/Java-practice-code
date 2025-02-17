import java.util.Stack;

public class PrefixToValue {
    public static int preFixToValue(String prefix){
        Stack<Integer> val = new Stack<>();
        for(int i = prefix.length()-1; i>=0; i--){
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <=57){
                val.push(ascii-48);
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch == '+') val.push(v1+v2);
                if(ch == '-') val.push(v1-v2);
                if(ch == '*') val.push(v1*v2);
                if(ch == '/') val.push(v1/v2);
            }
        }
        return val.pop();
    }
    public static void main(String[] args){
        String prefix = "-9/*+5346";
        int val = preFixToValue(prefix);
        System.out.println(val);
    }
}
