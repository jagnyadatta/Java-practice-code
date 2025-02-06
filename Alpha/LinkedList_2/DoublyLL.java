public class DoublyLL{
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    //static variables
    public static Node head;
    public static Node tail;
    public static int size;

    //print LL
    public static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(" "+temp.data + " <->");
            temp = temp.next;
        }
        System.out.print(" null");
        System.out.println();
    }
    //add first in doubly linked list
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            head.next = null;
            return ;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //add last in doubly Linked list
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //remove first in linked list
    public static void removeFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            return ;
        }
        head = head.next;
        head.prev = null;
    }

    //remove Last in Linked List
    public static void removeLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = tail = null;
            return ;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    // Reverse a DLL
    public static void reverse(){
        Node curr = head;
        Node prev = null;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args){
        // DoublyLL dll = new DoublyLL();
        addFirst(10);
        addFirst(10);
        // dll.printList();
        addLast(3);
        // dll.printList();
        addFirst(9);
        printList();
        removeFirst();
        printList();
        // dll.removeLast();
        // dll.printList();
        reverse();
        printList();
    }
}