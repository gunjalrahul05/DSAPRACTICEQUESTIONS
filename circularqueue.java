public class circularqueue {
    static class queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;

        queue(int n){
            arr = new int[n];
            size=n;
            rear=-1;
            front=-1;
        }

        public static boolean isEmpty(){
            return rear==-1&&front==-1;
        }

        public static boolean isFull(){
            if((rear+1)%size==front){
                return true;
            }else{
                return false;
            }
        }
        public static void add(int n){

            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=n;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int val = arr[front];
            
            if(front==rear){
                front=rear=-1;
            }else{
                front=(front+1)%size;
            }
           
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        queue q = new queue(3);

        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());
        q.add(6);

        while(!q.isEmpty()){
            System.err.println(q.remove());
        }
        
    }
}
