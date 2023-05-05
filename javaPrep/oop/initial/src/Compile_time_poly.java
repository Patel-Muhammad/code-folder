public class Compile_time_poly {
    public static void main(String[] args) throws Exception {
        
        Person s1 = new Person();
        s1.age = 20000;
        s1.name = "world";
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name,s1.age);

    }
}

class Person{
    String name;
    int age;

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name){
        System.out.println(name);
    }

}