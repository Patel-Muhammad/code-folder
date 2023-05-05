public class Practice {
    public static Node head;
    public static class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
            this.next = null;
        }
        public Node(){
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node b = new Node();
        System.out.println(b);
        System.out.println(b.data);
        System.out.println(b.next);
        // b.next = head;
        System.out.println(b);
        System.out.println(b.data);
        System.out.println(b.next);
        // head = b;
        System.out.println(head);
        // System.out.println(head.data);
        // System.out.println(head.next);
    }
}
