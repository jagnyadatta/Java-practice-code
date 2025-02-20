public class ImplementInArray{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        //Check Queue is Empty or not
        public boolean isEmpty(){
            return rear == -1;
        }

        //Add 
        public void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full.");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        //Remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear -1;
            return front;
        }

        //Peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args){
        Queue a = new Queue(3);
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