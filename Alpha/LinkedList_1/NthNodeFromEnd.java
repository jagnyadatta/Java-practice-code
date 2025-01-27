public class NthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }
    }

    //nth Node function 
    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int a = size - n + 1;
        temp = head;
        for(int i = 1; i<a; i++){
            temp = temp.next;
        }
        return temp;
    }

    //Delete nth Node from end
    public static Node deleteNthNodeFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i = 0; i<n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node temp = nthNode(a,1);
        System.out.println(temp.data);
        temp = a;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
        temp = a;
        Node temp2 = deleteNthNodeFromEnd(temp, 2);
        System.out.println(temp2.data);
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
