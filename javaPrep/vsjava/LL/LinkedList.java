public class LinkedList{

    Node head;

    public class Node{
        int data;
        Node nxt;
        

        public Node(int n){
            this.data = n;
            this.nxt = null;
        }
    }

    public void addFirst(int n){
        Node newNode = new Node(n);
        // if(head == null){
        //     head = newNode;
        //     return;
        // }
        newNode.nxt = head;
        head = newNode;
    }

    public void addLast(int n){

        if(head == null){
            addFirst(n);
            return;
        }
        Node newNode  = new Node(n);
        Node temp = head;
        while(temp.nxt!= null){
            temp = temp.nxt;
        }
        temp.nxt = newNode;
        
    }

    public void delFirst(){
        if(head == null){
            System.out.println("Linked list is Empty!");
            return;
        }
        head = head.nxt;
    }

    public void delLast(){
        if(head.nxt == null){
            head = null;
            return;
        }
        if(head == null){
            System.out.println("Linked list is empty!");
        }
        Node temp = head;
        while(temp.nxt.nxt != null){
            temp = temp.nxt;
        }
        temp.nxt = null;

    }


    public void display(){
        if(head == null){
            System.out.println("Empty!");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.nxt;
        }
        System.out.print("NULL");
        
    }

    
}