public class queueimplementation {

    static class queue{
        static int arr[];
        static int size;

        static int rear;

        queue(int n){
            arr = new int[n];
            size=n;
            rear=-1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int n){

            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=n;
        }

        public static int remove(){
            if(rear==-1){
                System.out.println("Queue is empty");
                return -1;
            }

            int val = arr[rear];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String[] args) {

        queue p1 = new queue(4);

        p1.add(1);
        p1.add(2);
        p1.add(3);
        p1.add(4);

        while(!p1.isEmpty()){
            System.out.println(p1.peek());
            p1.remove();
        }
        
    }
    
}
