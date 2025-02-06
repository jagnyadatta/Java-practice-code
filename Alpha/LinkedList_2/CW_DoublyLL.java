public class CW_DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.next = null;
        }
    }
    //Disply LL
    public static void displayLL(Node head){
        Node temp = head;
        System.out.print("null - ");
        while(temp != null){
            System.out.print(temp.data + " - ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    //Display Reverse LL
    public static void displayReverseLL(Node tail){
        Node temp = tail;
        System.out.print("null - ");
        while(temp != null){
            System.out.print(temp.data + " - ");
            temp = temp.prev;
        }
        System.out.print("null");
        System.out.println();
    }
    
    //Display LL with random node
    public static void displayLLRandom(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        displayLL(temp);
    }

    //Add new Node at head
    public static Node addFirst(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return newNode;
    }

    //Add Node at last of DLL
    public static void addLast(Node head, int data){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        newNode.prev = temp;
    }

    //Add Node at specific Index
    public static void addAtIndex(Node head, int idx, int data){
        Node temp = head;
        for(int i = 1; i<idx; i++){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }
    }

    //Check Palindrome or not
    public static boolean isPalindrome(Node head){
        Node temp1 = head;
        Node temp2 = head;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        while(temp1 != temp2){
            if(temp1.data != temp2.data) return false;
            temp1 = temp1.next;
            temp2 = temp2.prev;
        }
        return true;
    }

    //find two sum of using DLL
    public static boolean isPossible(Node head, int target){
        Node temp1 = head;
        Node temp2 = head;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        while(temp1.data < temp2.data){
            if(temp1.data + temp2.data == target){
                return true;
            }else if(temp1.data + temp2.data > target){
                temp2 = temp2.prev;
            }else{
                temp1 = temp1.next;
            }
        }
        return false;
    }

    //Find critical Point max and min 
    public static void findCriticalPoint(Node head){
        Node temp = head.next;
        Node c1 = head;
        Node c2 = head;
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;
        int tempLength = 0;
        //maximum length finding critical point from left side
        while(temp.next.next != null){
            if(temp.data > temp.prev.data && temp.data > temp.next.data){
                c1 = temp;
                break;
            }else if(temp.data < temp.prev.data && temp.data < temp.next.data){
                c1 = temp;
                break;
            }else{
                temp = temp.next;
            }
        }
        //for move temp to before tail node
        while(temp.next.next != null){
            temp = temp.next;
        }
        //for maximum length finding critical point form right side
        while(temp.prev != c1.next){
            if(temp.data > temp.prev.data && temp.data > temp.next.data){
                c2 = temp;
                break;
            }else if(temp.data < temp.prev.data && temp.data < temp.next.data){
                c2 = temp;
                break;
            }else{
                temp = temp.prev;
            }
        }
        //finally finding maximum length of two critical point
        temp = c1;
        while(temp != c2){
            maxLength++;
            temp = temp.next;
        }

        //Now we have to find minimum length of two critical point
        c1 = head;
        c2 = head;
        temp = c1.next;
        while(temp.next.next != null){
            if(temp.data > temp.prev.data && temp.data > temp.next.data){
                c1 = temp;
                break;
            }else if(temp.data < temp.prev.data && temp.data < temp.next.data){
                c1 = temp;
                break;
            }else{
                temp = temp.next;
            }
        }
        temp = c1.next;
        while(temp.next.next != null){
            if(temp.data > temp.prev.data && temp.data > temp.next.data){
                c2 = temp;
                while(c1 != c2){
                    tempLength++;
                    c1 = c1.next;
                }
                minLength = Math.min(minLength,tempLength);
                temp = c1.next;
            }else if(temp.data < temp.prev.data && temp.data < temp.next.data){
                c2 = temp;
                while(c1 != c2){
                    tempLength++;
                    c1 = c1.next;
                }
                minLength = Math.min(minLength,tempLength);
                temp = c1.next;
            }else{
                temp = temp.next;
            }
        }

        System.out.println("Maximum Length : "+maxLength);
        System.out.println("Minimum Length : "+minLength);
    }

    public static void main(String[] args){
        // 4 - 10 - 2 - 99 - 13
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(7);
        Node g = new Node(8);
        Node h = new Node(9);
        Node i = new Node(1);
        Node j = new Node(10);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = g;
        g.prev = f;
        g.next = h;
        h.prev = g;
        h.next = i;
        i.prev = h;
        i.next = j;
        j.prev = i;
        j.next = null;
        // displayLL(a);
        // displayReverseLL(e);
        // displayLLRandom(e);

        // Node temp = addFirst(a, 33);
        // displayLL(temp);

        // addLast(a, 79);
        // displayLL(a);

        // addAtIndex(a, 3, 666);
        // displayLL(a);

        // System.out.println(isPalindrome(a));

        // System.out.println(isPossible(a, 11));

        findCriticalPoint(a);
    }
}
