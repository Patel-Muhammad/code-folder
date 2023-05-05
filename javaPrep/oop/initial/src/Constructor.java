public class Constructor {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("muhammad",20);
        s1.printInfo();

    }
}

class Student{
    String name;
    int age;

    Student(String naam, int saal){
        this.name = naam;
        this.age = saal;
    }

    Student(){}

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}