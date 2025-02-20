import java.util.Stack;

public class ImplementInStack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        
        //check is empty
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //Add 
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.add(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        
        //Remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return s1.pop();
        }

        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args){
        Queue a = new Queue();
        a.add(1);
        a.add(2);
        a.add(3);

        while(!a.isEmpty()){
            System.out.println(a.peek());
            a.remove();
        }
    }
}
