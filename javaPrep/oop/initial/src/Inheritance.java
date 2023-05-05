public class Inheritance {
    public static void main (String[] args){
        Triangle t1 = new Triangle(); // Creating object of class "Triangle"
        t1.sides = 3;
        t1.color = "white";

        Rectangle r1 = new Rectangle(); //Creating object of class "Rectangle"
        r1.sides  = 4;
        r1.color = "yellow";

        t1.printInfo();
        r1.printInfo();

    }
}

class Shape{  // parent class
    String color;
}
class Triangle extends Shape{ //child class1
    int sides;
    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.sides);
    }
}
class Rectangle extends Shape{ //child class2
    int sides;
    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.sides);
    }
}
