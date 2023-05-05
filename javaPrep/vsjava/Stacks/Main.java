public class Main {
    public static void main(String[] args) {
        Cstack obj = new Cstack(5);
        Cstack obj2 = new Cstack(7);

        obj.push(30);
        obj.push(50);
        obj.push(90);
        System.out.println("For OBJ: ");
        System.out.println(obj.peek());
        System.out.println(obj.ptr);

        System.out.println("\n");

        obj2.push(3);
        obj2.push(5);
        obj2.push(9);
        obj2.push(2);

        System.out.println("For OBJ2: ");
        System.out.println(obj2.peek());
        System.out.println(obj2.ptr);


        


        





    }
}
