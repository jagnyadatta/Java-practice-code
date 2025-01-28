public class OddEvenLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static Node findOddEven(Node head){
        Node ol = new Node(0);
        Node odd = ol;
        Node el = new Node(0);
        Node even = el;
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                Node t = new Node(temp.data);
                odd.next = t;
                odd = t;
                temp = temp.next;
            }else{
                Node t = new Node(temp.data);
                even.next = t;
                even = t;
                temp = temp.next; 
            }
        }
        ol = ol.next;
        el = el.next;
        odd.next = el;
        return ol;
    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;


        Node t = a;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
        Node temp = findOddEven(a);
        t = temp;
        while(t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
    }   
}
