
public class Main {
    public static void main(String[] args) {
        LL li = new LL();
        li.addFirst(20);
        li.addFirst(0);
        li.addFirst(22);
        li.addFirst(77);
        li.addFirst(90);
        li.delFirst();
        li.delLast();
        li.delFirst();
        li.delLast();
        li.delLast();
        li.addLast(90);
        li.display();
    }
   
}
