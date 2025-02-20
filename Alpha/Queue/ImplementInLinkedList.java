// import java.util.*;

public class ImplementInLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        //Check Queue is Empty or not
        public boolean isEmpty(){
            return head == null && tail == null;
        }

        //Add 
        public void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //Remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
            return front;
        }

        //Peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
        Queue a = new Queue();
        // Queue<Integer> a = new LinkedList<>();       //we can use both class for declaring a Queue. 
        // Queue<Integer> a = new ArrayDeque<>();       //Either LinkedList<>() or ArrayDeque<>();
        a.add(1);
        a.add(2);
        a.add(3);
        // a.remove();
        // a.peek();
        // a.isEmpty();
        // System.out.println(a.remove());
        // System.out.println(a.remove());
        // System.out.println(a.isEmpty());

        while(!a.isEmpty()){
            System.out.println(a.peek());
            a.remove();
        }
    }
}
