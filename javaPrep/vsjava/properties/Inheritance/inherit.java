package properties.Inheritance;

public class inherit {
    int l;
    int b;
    int h;

    inherit(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    inherit(int l,int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    inherit(int side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    public void demoInfo(){
        System.out.println("Hello Iam a box!!");
    }

    public void info(){
        System.out.println("L = " + this.l);
        System.out.println("B = " + this.b);
        System.out.println("H = " + this.h);
    }

}
