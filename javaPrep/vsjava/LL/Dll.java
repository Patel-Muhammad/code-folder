public class Dll {
    Node head;

    public class Node{
        Node pre;
        int data;
        Node next;

        public Node(int n){
            this.data = n;
            this.pre = null;
            this.next = null;
        }
    }

    public void addFirst(int n){
        if(head == null){
            Node newNode = new Node(n);
            head = newNode;
        }
        else{
            Node newNode = new Node(n);
            newNode.next = head;
            head.pre = newNode;
            head =head.pre;
        }
    }

    public void display(){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public void addLast(int n){
        if(head == null){
            addFirst(n);
        }
        else{
            Node newNode = new Node(n);
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.pre = temp;
        }
    }

}
