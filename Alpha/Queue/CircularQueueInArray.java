public class CircularQueueInArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        //Check Queue is Empty or not
        public boolean isEmpty(){
            return rear == -1;
        }

        //check Queue is Full or not
        public boolean isFull(){
            return (rear+1) % size == front;
        }

        //Add 
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is Full.");
                return;
            }
            //add 1st element
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //Remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int result = arr[front];

            //on the last element
            if(rear == front){
                front = rear = -1;
            }else{
                front = (front+1) % size;
            }
            return result;
        }

        //Peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args){
        Queue a = new Queue(3);
        a.add(1);
        a.add(2);
        a.add(3);

        while(!a.isEmpty()){
            System.out.println(a.peek());
            a.remove();
        }
    }
}
