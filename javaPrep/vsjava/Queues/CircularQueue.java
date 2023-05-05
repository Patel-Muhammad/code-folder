public class CircularQueue {
    int array[];
    private static final int d_size = 10;
    int front = -1, end = -1;
    int size = 0;

    public CircularQueue(){
        this.array = new int[d_size];
    }

    public CircularQueue(int n){
        this.array = new int[n];
    }

    public boolean enqueue (int value){
        if(isFull()){
            //check if array is full or not
            System.out.println("Array full!!");
            return false;
        }
        if(front == -1){
            front++;
        }
        end  = (end+1) % array.length;
        array[end] = value;
        size++;
        return true;
    }

    public int dequeue(){
        if(isEmpty()){
            //check is array is empty or not
            System.out.println("Queue is empty !!");
            return -100;
        }
        int removed = array[front];
        if(front == end){
            front = end  = -1;
        }
        else{
            front = (front+1) % array.length;
            size--;
           
        }
         return removed;
        
    }

    public void peekAll(){
        if(isEmpty()){
            //check is array is empty or not
            System.out.println("Queue is empty !!");
            return;
        }
        for (int i = front; i <= end; i++) {
            System.out.println(array[i]);
        }
    }

    private boolean isEmpty(){
        return (front == -1) && (end == -1);
    }

    private boolean isFull(){
        return (end+1) % array.length == front;
    }

}
