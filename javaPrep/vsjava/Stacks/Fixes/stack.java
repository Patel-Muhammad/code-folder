package Fixes;
public class stack {

    char arr[];
    int ptr = -1;
    

    public stack(){
        this.arr = new char[20];
    }
    public stack(int n){
        this.arr = new char[n];
    }
    public void shift(){
        System.out.print(arr[ptr-1]);
        arr[ptr-1] = arr[ptr];
        ptr--;
    }
    public void push(char a){
        if(isFull()){
            System.out.println("StackOverFlow");
        }
        else{
            ptr++;
            arr[ptr] = a;
        }
    }
    public void pop(){
            if(isEmpty()){
                System.out.println("Stack Underflow!!");
            }
            else{
                if(arr[ptr] =='(' || arr[ptr] ==')' ){
                    ptr--;
                }
                else{
                    char removed = arr[ptr];
                    ptr--;
                    System.out.print(removed);
                }
                
            }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow!!");
        }
        else{
            System.out.print(arr[ptr]);
        }
        
    }

    public char top(){
        if(isEmpty()){
            System.out.println("Stack Underflow!!");
            return 'N';
        }
        else{
            
            return arr[ptr];
        }
    }
    public int topIndex(){
        return ptr;
    }

    public char lastTop(){
        if(ptr-1 >= 0){
            return arr[ptr-1];
        }
        else{
            return '$';
        }
        
    }

    private boolean isEmpty(){
        if(ptr == -1){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean isFull(){
        if(arr.length - 1 == ptr){
            return true;
        }
        else{
            return false;
        }
    }




}
