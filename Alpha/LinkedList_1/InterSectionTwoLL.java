public class InterSectionTwoLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    //length find
    public static int findLen(Node head){
        int len = 0;
        Node temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    //find intersection
    public static Node findIntersection(Node head1, Node head2){
        int m = findLen(head1);
        int n = findLen(head2);
        // System.out.println(m + " " + n);
        int diff = m - n;
        Node temp1 = head1;
        Node temp2 = head2;
        for(int i = 0; i<diff; i++){
            temp1 = temp1.next;
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
    public static void main(String[] args){
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        Node g = new Node(90);
        Node h = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;
        g.next = h;
        h.next = d;

        Node temp = findIntersection(a, g);
        System.out.println(temp.data);
    }
}
