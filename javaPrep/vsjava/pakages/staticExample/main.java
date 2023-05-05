package pakages.staticExample;

public class main {
    public static void main(String[] args) {
        main obj = new main();
        obj.greet();
    }

    void greet(){
        System.out.println("Hello there!!");
    }

    static void fun() {
       // greet(); cannot use non-static method in static

       //instead u have to create an object to use non-static in static:
       main obj = new main();
       obj.greet();

    }

    void fun2(){
        //we can use non static in non static
        greet();
    }
}
