public class LinkedList {
    //Node class create
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //head and tail of Linked List.
    public static Node head;   
    public static Node tail;

    //Create AddFirst Node:
    public void addFirst(int data){
        //step-1 = create a Node
        Node newNode = new Node(data);
        //check head is null or not
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step-2 => newNode.next = head;
        newNode.next = head;
        //stap-3 => head = newNode
        head = newNode;
    }

    //Addlast in LL:
    public void addLast(int data){
        //create Node
        Node newNode = new Node(data);
        //check head is null or not / LL exist or not
        if(head == null){
            head = tail = newNode;
            return;
        }
        //update tail next pointer :
        tail.next = newNode;
        //update tail value:
        tail = newNode;
    }

    //print LL:
    public void printLL(){
        //check is there LL exist or not
        if(head == null){
            System.out.println("LL is empty!");
            return;
        }
        //create a temp node
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addLast(3);
        ll.printLL();
        ll.addLast(4);
        ll.printLL();
    }
}