public class Cqueue{
    private int array[];
    private final int d_size = 10;
    private int end = -1;

    public Cqueue(){
        this.array = new int[d_size];
    }
    public Cqueue(int size){
        this.array = new int[size];
    }

    private boolean isEmpty(){
        return end == -1;
    }

    private boolean isFull(){
        return array.length - 1 == end;
    }

    public boolean enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full !!");
            return false;
        }
        end++;
        array[end] = value;
        return true;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is alreaddy empty!!");
        }
        int removed = array[0];
        for (int i = 0; i < end; i++) {
            array[i] = array[i+1];
        }
        end--;
        return removed;
    }

    public int peekLast(){
        if(isEmpty()){
            System.out.println("Queue is alreaddy empty!!");
        }
        return array[end];
    }

    public int peekFirst(){
        if(isEmpty()){
            System.out.println("Queue is alreaddy empty!!");
        }
        return array[0];
    }


}