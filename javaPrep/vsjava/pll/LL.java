public class LL{
    
    Node head;

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        if(head == null){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void delFirst(){
        if(head == null){
            System.out.println("List Empty!");
            return;
        }
        head = head.next;
    }
    public void delLast(){
        if(head == null){
            System.out.println("List Empty!");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public void display(){
        if(head == null){
            System.out.println("List empty!");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }


}