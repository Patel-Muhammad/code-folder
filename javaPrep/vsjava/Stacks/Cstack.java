
public class Cstack{

    public int array[];
    private final int default_size = 10;
    public int ptr = -1;

    public Cstack(){
        this.array = new int[default_size];
    }
    public Cstack(int size){
        this.array = new int[size];
    }

    public boolean push(int value) {
        if(isFull()){
            System.out.println("Stack is full !!");
        }
        ptr++;
        array[ptr] = value;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("There is nothing in the stack to pop !!");
        }
        int removed = array[ptr];
        ptr--;
        return removed;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("There is nothing in the stack to pop !!");
        }
        return array[ptr];
    }

    private boolean isEmpty(){
        return ptr == -1;
    }

    private boolean isFull(){
        return ptr == array.length - 1;
    }



}