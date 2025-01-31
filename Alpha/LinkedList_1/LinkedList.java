public class LinkedList {
    // Node class create
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head and tail of Linked List.
    public static Node head;
    public static Node tail;
    public static int size;

    // Create AddFirst Node:
    public void addFirst(int data) {
        // step-1 = create a Node
        Node newNode = new Node(data);
        size++;
        // check head is null or not
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step-2 => newNode.next = head;
        newNode.next = head;
        // stap-3 => head = newNode
        head = newNode;
    }

    // Addlast in LL:
    public void addLast(int data) {
        // create Node
        Node newNode = new Node(data);
        size++;
        // check head is null or not / LL exist or not
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // update tail next pointer :
        tail.next = newNode;
        // update tail value:
        tail = newNode;
    }

    // print LL:
    public void printLL() {
        // check is there LL exist or not
        if (head == null) {
            System.out.println("LL is empty!");
            return;
        }
        // create a temp node
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add Node in middle of the LL
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove Frist Node from LL
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int data = head.data;
            head = tail = null;
            size = 0;
            return data;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    // Remove Last Node From LL
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int data = head.data;
            head = tail = null;
            size = 0;
            return data;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Search position of a Node Using iterative;
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // if key not found
        return -1;
    }

    // Search position of a Node Using Recursive:
    public int recSearch(int key) {
        return helper(head, key);
    }

    // helper function for recSearch
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    // Reverse a LinkedList :
    public void reverseLL() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Remove nth node form the end of LL:
    public void removeNthFromEnd(int n) {
        //ITERABLE APPROACH
        // int size = 0;
        // Node temp = head;
        // while (temp != null) {
        //     temp = temp.next;
        //     size++;
        // }
        // if (n == size) {
        //     head = head.next;
        //     return;
        // }
        // int i = 1;
        // int iToFind = size - n;
        // Node prev = head;
        // while (i < iToFind) {
        //     prev = prev.next;
        //     i++;
        // }
        // prev.next = prev.next.next;
        // return;

        //TWO POINTER APPROACH
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;
        for(int i = 0; i<=n; i++){
            first = first.next;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return;
    }
    
    //find mid Node using slow fast method
    public static Node findMid(Node Head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;    // jump +1
            fast = fast.next.next; //jump +2
        }
        return slow;
    }
    
    //Check if LL is Palindrome or Not:
    public boolean isPalindrome() {
        if(head == null && head.next == null){
            return true;
        }
        //step-1 find mid
        Node midNode = findMid(head);

        //step-2 is reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //step-3 check left half and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
        }
        return true;
    }

    //remove cycle in a LL
    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(!cycle){
            return;
        }
        slow = head;
        Node prev = fast;
        while(fast != slow){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.printLL();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.printLL();
        // System.out.println(ll.size);
        // ll.removeLast();
        // ll.printLL();
        // System.out.println(ll.size);
        // System.out.println(ll.recSearch(2));
        // System.out.println(ll.recSearch(6));
        // ll.removeNthFromEnd(3);
        // ll.printLL();
        System.out.println(ll.isPalindrome());
    }
}