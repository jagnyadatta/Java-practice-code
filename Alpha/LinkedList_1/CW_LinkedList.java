public class CW_LinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args){
        Node a = new Node(3);
        Node b = new Node(4);
        a.next = b;
        System.out.println(a.next.data);
    }
    
}
